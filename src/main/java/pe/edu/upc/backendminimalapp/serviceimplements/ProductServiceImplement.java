package pe.edu.upc.backendminimalapp.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendminimalapp.entities.Product;
import pe.edu.upc.backendminimalapp.entities.Review;
import pe.edu.upc.backendminimalapp.repositories.IProductRepository;
import pe.edu.upc.backendminimalapp.serviceinterfaces.IProductService;

import java.util.List;

@Service
public class ProductServiceImplement implements IProductService {

    @Autowired
    private IProductRepository pR;

    @Override
    public void insert(Product product) {
        pR.save(product);
    }

    @Override
    public List<Product> list() {
        return pR.findAll();
    }

    @Override
    public void update(Product product) {
        pR.save(product);
    }

    @Override
    public void deleteById(int id) {
        pR.deleteById(id);
    }

    @Override
    public Product findById(int id) {
        return pR.findById(id).orElse(new Product());
    }

    @Override
    public List<Product> searchByCategory(String category) {
        return pR.searchByCategory(category);
    }

    @Override
    public List<Product> searchByName(String name, String category) {
        return pR.searchByName(name, category);
    }
}
