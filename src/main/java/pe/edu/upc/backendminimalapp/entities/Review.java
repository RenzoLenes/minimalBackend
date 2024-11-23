package pe.edu.upc.backendminimalapp.entities;


import jakarta.persistence.*;


@Entity
@Table(name = "Review")
public class Review {

    @EmbeddedId
    private ReviewId id;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id",  nullable = false)
    private Product product;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id",  nullable = false)
    private User user;

    @Column(name = "calification", nullable = false)
    private Double calification;

    @Column(name = "description", length = 250)
    private String description;


    public Review() {
    }

    public Review(ReviewId id, Product product, User user, Double calification, String description) {
        this.id = id;
        this.product = product;
        this.user = user;
        this.calification = calification;
        this.description = description;
    }

    public ReviewId getId() {
        return id;
    }

    public void setId(ReviewId id) {
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

    public Double getCalification() {
        return calification;
    }

    public void setCalification(Double calification) {
        this.calification = calification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


