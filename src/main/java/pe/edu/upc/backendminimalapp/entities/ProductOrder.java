package pe.edu.upc.backendminimalapp.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "Product_Order")
public class ProductOrder {
    @EmbeddedId
    private ProductOrderId id;

    @ManyToOne
    @MapsId("productId") // Vincula categoryId de CategoryProductId con Category
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;


    @ManyToOne
    @MapsId("userId") // Vincula categoryId de CategoryProductId con Category
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "amount", nullable = false)
    private Double amount;

    public ProductOrder() {
    }

    public ProductOrder(ProductOrderId id, Product product, User user, Integer quantity, Double amount) {
        this.id = id;
        this.product = product;
        this.user = user;
        this.quantity = quantity;
        this.amount = amount;
    }

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

    public User getUsers() {
        return user;
    }

    public void setUsers(User user) {
        this.user = user;
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
