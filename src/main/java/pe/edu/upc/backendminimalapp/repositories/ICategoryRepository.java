package pe.edu.upc.backendminimalapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backendminimalapp.entities.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Integer> {
}
