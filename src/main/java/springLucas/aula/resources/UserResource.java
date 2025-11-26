package springLucas.aula.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springLucas.aula.entities.Users;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<Users> findAll(){
        Users u = new Users(1L,"Maria", "maria@gmail.com", "8146541321", "12345");
        return ResponseEntity.ok().body(u);
    }
}
