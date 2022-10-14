package farmacia.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import farmacia.model.Categoria;

/**
 * @author Fabiana
 * @version 1.0
 */
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}
