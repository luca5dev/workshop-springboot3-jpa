package springLucas.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springLucas.aula.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {



}
