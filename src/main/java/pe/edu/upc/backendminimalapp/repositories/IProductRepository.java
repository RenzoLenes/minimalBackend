package pe.edu.upc.backendminimalapp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backendminimalapp.entities.Product;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Query(value ="SELECT p.product_id,p.name,p.price_real,p.discount,p.description, p.image FROM category_product cp INNER JOIN product p \n" +
            "ON p.product_id=cp.product_id INNER JOIN category c\n" +
            "ON c.id=cp.category_id WHERE c.name =:category" ,nativeQuery = true)
    public List<Product> searchByCategory(String category);

    @Query(value = "SELECT \n" +
            "    p.product_id, \n" +
            "    p.name, \n" +
            "    p.price_real, \n" +
            "    p.discount, \n" +
            "    p.description, \n" +
            "    p.image \n" +
            "FROM \n" +
            "    category_product cp \n" +
            "INNER JOIN \n" +
            "    product p ON p.product_id = cp.product_id \n" +
            "INNER JOIN \n" +
            "    category c ON c.id = cp.category_id \n" +
            "WHERE p.name LIKE CONCAT('%', :name, '%')\n" +
            "    AND (:category IS NULL OR :category = '' OR c.name = :category)\n", nativeQuery = true)
    public List<Product> searchByName(@Param("name") String name, @Param("category") String category);

}
