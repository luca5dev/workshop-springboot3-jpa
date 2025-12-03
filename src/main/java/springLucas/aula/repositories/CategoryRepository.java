package springLucas.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springLucas.aula.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
