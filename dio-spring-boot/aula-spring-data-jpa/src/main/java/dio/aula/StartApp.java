package dio.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner{

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.filtrarPorNome("Maria Fernanda");
        for (User u: users) {
            System.out.println(u);
        }

        insertUser();
    }

    private void insertUser(){
        User user = new User();
        user.setName("Maria Fernanda");
        user.setUsername("Mariazinha124");
        user.setPassword("maria124");
        repository.save(user);

        for (User u : repository.findAll()) {
            System.out.println(u);
        }
    }
    
}
