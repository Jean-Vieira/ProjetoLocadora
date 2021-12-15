package jean.ProjetoLocadora.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import jean.ProjetoLocadora.Models.Filmes;

@Repository
public interface FilmesRepository extends CrudRepository<Filmes, Long>{

}
