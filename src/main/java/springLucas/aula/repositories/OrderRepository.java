package springLucas.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springLucas.aula.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
