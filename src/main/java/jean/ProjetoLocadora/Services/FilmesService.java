package jean.ProjetoLocadora.Services;

import java.util.List;

import jean.ProjetoLocadora.Models.Filmes;

public interface FilmesService {
	
	public void salvar(Filmes filmes);
	
	public Filmes buscarPorId(Long id);
	
	public List<Filmes> ListarTodos();
	
	public void removerPorId(Long id);
	
	

}
