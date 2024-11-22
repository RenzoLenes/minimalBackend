package pe.edu.upc.backendminimalapp.serviceinterfaces;

import pe.edu.upc.backendminimalapp.entities.Category;

import java.util.List;

public interface ICategoryService {

    public void insert(Category category);
    public List<Category> list();
    public void update(Category category);
    public void deleteById(int id);
    public Category findById(int id);
}
