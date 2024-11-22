package pe.edu.upc.backendminimalapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backendminimalapp.entities.ProductOrder;
import pe.edu.upc.backendminimalapp.entities.ProductOrderId;

@Repository
public interface IProductOrderRepository extends JpaRepository<ProductOrder, ProductOrderId> {
}
