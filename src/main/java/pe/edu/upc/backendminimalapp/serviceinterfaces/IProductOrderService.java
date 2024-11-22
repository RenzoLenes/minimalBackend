package pe.edu.upc.backendminimalapp.serviceinterfaces;

import pe.edu.upc.backendminimalapp.entities.ProductOrder;
import pe.edu.upc.backendminimalapp.entities.ProductOrderId;

import java.util.List;

public interface IProductOrderService {

    public void insert(ProductOrder productOrder);
    public List<ProductOrder> list();
    public void update(ProductOrder productOrder);
    public void deleteById(ProductOrderId pid);
    public ProductOrder findById(ProductOrderId pid);
}
