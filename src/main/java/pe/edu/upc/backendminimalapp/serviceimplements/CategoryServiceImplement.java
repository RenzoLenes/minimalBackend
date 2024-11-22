package pe.edu.upc.backendminimalapp.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendminimalapp.entities.Category;
import pe.edu.upc.backendminimalapp.repositories.ICategoryRepository;
import pe.edu.upc.backendminimalapp.serviceinterfaces.ICategoryService;

import java.util.List;

@Service
public class CategoryServiceImplement implements ICategoryService {

    @Autowired
    private ICategoryRepository cR;

    @Override
    public void insert(Category category) {
        cR.save(category);
    }

    @Override
    public List<Category> list() {
        return cR.findAll();
    }

    @Override
    public void update(Category category) {
        cR.save(category);
    }

    @Override
    public void deleteById(int id) {
        cR.deleteById(id);
    }

    @Override
    public Category findById(int id) {
        return cR.findById(id).orElse(new Category());
    }
}
