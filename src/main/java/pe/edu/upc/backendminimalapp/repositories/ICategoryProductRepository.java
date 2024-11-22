package pe.edu.upc.backendminimalapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backendminimalapp.entities.CategoryProduct;
import pe.edu.upc.backendminimalapp.entities.CategoryProductId;

@Repository
public interface ICategoryProductRepository extends JpaRepository<CategoryProduct, CategoryProductId> {
}
