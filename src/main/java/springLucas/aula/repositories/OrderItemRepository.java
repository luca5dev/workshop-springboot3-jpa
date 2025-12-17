package springLucas.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springLucas.aula.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {



}
