
package springLucas.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springLucas.aula.entities.Users;
import springLucas.aula.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<Users> findAll(){
        return repository.findAll();
    }

    public Users findById(Long id){
        Optional<Users> obj = repository.findById(id);
        return obj.get();
    }

    public Users insert(Users obj){
         return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Users update(Long id, Users obj){
        Users entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Users entity, Users obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
