package br.com.cast.castinside.repository;

import br.com.cast.castinside.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String username);
}
