package pe.edu.upc.backendminimalapp.dtos;

import pe.edu.upc.backendminimalapp.entities.Product;
import pe.edu.upc.backendminimalapp.entities.ReviewId;
import pe.edu.upc.backendminimalapp.entities.Users;


public class ReviewDTO {

    private ReviewId id;

    private Product product;

    private Users users;

    private Double calification;

    private String description;

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
