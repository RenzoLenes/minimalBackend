package pe.edu.upc.backendminimalapp.dtos;

import pe.edu.upc.backendminimalapp.entities.Product;
import pe.edu.upc.backendminimalapp.entities.ProductOrderId;
import pe.edu.upc.backendminimalapp.entities.Users;



public class ProductOrderDTO {

    private ProductOrderId id;

    private Product product;

    private Users users;

    private Integer quantity;

    private Double amount;

    public ProductOrderId getId() {
        return id;
    }

    public void setId(ProductOrderId id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
