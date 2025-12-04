package springLucas.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springLucas.aula.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
