package pe.edu.upc.backendminimalapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backendminimalapp.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    public User findByUsername(String username);
}
