package jean.ProjetoLocadora.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jean.ProjetoLocadora.Models.Clientes;

@Repository
public interface ClientesRepository extends CrudRepository<Clientes, Long>{

}
