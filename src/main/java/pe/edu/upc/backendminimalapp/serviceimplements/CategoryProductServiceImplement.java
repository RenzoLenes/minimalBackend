package pe.edu.upc.backendminimalapp.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendminimalapp.entities.CategoryProduct;
import pe.edu.upc.backendminimalapp.entities.CategoryProductId;
import pe.edu.upc.backendminimalapp.repositories.ICategoryProductRepository;
import pe.edu.upc.backendminimalapp.serviceinterfaces.ICategoryProductService;

import java.util.List;

@Service
public class CategoryProductServiceImplement implements ICategoryProductService {

    @Autowired
    private ICategoryProductRepository cPR;

    @Override
    public void insert(CategoryProduct categoryProduct) {
        cPR.save(categoryProduct);
    }

    @Override
    public List<CategoryProduct> list() {
        return cPR.findAll();
    }

    @Override
    public void update(CategoryProduct categoryProduct) {
        cPR.save(categoryProduct);
    }

    @Override
    public void deleteById(CategoryProductId cid) {
        cPR.deleteById(cid);
    }

    @Override
    public CategoryProduct findById(CategoryProductId cid) {
        return cPR.findById(cid).orElse(new CategoryProduct());
    }
}
