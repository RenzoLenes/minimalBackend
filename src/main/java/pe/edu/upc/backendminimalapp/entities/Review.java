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
    private Users users;

    @Column(name = "calification", nullable = false)
    private Double calification;

    @Column(name = "description", length = 250)
    private String description;


    public Review() {
    }

    public Review(ReviewId id, Product product, Users users, Double calification, String description) {
        this.id = id;
        this.product = product;
        this.users = users;
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
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


