package pe.edu.upc.backendminimalapp.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendminimalapp.entities.ProductOrder;
import pe.edu.upc.backendminimalapp.entities.ProductOrderId;
import pe.edu.upc.backendminimalapp.repositories.IProductOrderRepository;
import pe.edu.upc.backendminimalapp.serviceinterfaces.IProductOrderService;

import java.util.List;

@Service
public class ProductOrderServiceImplement implements IProductOrderService {

    @Autowired
    private IProductOrderRepository pOR;

    @Override
    public void insert(ProductOrder productOrder) {
        pOR.save(productOrder);
    }

    @Override
    public List<ProductOrder> list() {
        return pOR.findAll();
    }

    @Override
    public void update(ProductOrder productOrder) {
        pOR.save(productOrder);
    }

    @Override
    public void deleteById(ProductOrderId pid) {
        pOR.deleteById(pid);
    }

    @Override
    public ProductOrder findById(ProductOrderId pid) {
        return pOR.findById(pid).orElse(new ProductOrder());
    }
}
