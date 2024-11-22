package pe.edu.upc.backendminimalapp.serviceinterfaces;

import pe.edu.upc.backendminimalapp.entities.Product;

import java.util.List;

public interface IProductService {
    public void insert(Product product);
    public List<Product> list();
    public void update(Product product);
    public void deleteById(int id);
    public Product findById(int id);
    public List<Product> searchByCategory(String category);
    public List<Product> searchByName(String name, String category);
}
