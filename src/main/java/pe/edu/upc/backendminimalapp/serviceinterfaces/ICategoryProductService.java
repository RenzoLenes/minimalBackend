package pe.edu.upc.backendminimalapp.serviceinterfaces;

import pe.edu.upc.backendminimalapp.entities.CategoryProduct;
import pe.edu.upc.backendminimalapp.entities.CategoryProductId;

import java.util.List;

public interface ICategoryProductService {
    public void insert(CategoryProduct categoryProduct);
    public List<CategoryProduct> list();
    public void update(CategoryProduct categoryProduct);
    public void deleteById(CategoryProductId cid);
    public CategoryProduct findById(CategoryProductId cid);
}
