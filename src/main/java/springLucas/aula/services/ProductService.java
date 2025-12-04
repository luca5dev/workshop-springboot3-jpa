
package springLucas.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springLucas.aula.entities.Product;
import springLucas.aula.entities.Users;
import springLucas.aula.repositories.ProductRepository;
import springLucas.aula.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }



}
