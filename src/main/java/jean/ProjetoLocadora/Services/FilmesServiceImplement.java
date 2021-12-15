package jean.ProjetoLocadora.Services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jean.ProjetoLocadora.Models.Filmes;
import jean.ProjetoLocadora.Repositories.FilmesRepository;

@Service
public class FilmesServiceImplement implements FilmesService{

	private FilmesRepository filmesRepository;
	
	public FilmesServiceImplement(FilmesRepository filmesRepository) {
		this.filmesRepository = filmesRepository;
	}

	@Override
	public void salvar(Filmes filmes) {
		this.filmesRepository.save(filmes);
		
	}

	@Override
	public Filmes buscarPorId(Long id) {
		Optional<Filmes> op = this.filmesRepository.findById(id);
		return op.get();
	}

	@Override
	public List<Filmes> ListarTodos() {
		List<Filmes> filmes = new ArrayList<>();
		Iterator<Filmes> iterator = this.filmesRepository.findAll().iterator();
		while(iterator.hasNext()){
			filmes.add(iterator.next());
		}
		return filmes;
	}

	@Override
	public void removerPorId(Long id) {
		this.filmesRepository.deleteById(id);
		
	}

}
