package pe.edu.upc.backendminimalapp.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;

    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "price_real")
    private Double priceReal;

    @Column(name = "discount")
    private Double discount;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "image", length = 255)
    private String image;

    public Product() {
    }

    public Product(Integer product_id, String name, Double priceReal, Double discount, String description, String image) {
        this.product_id = product_id;
        this.name = name;
        this.priceReal = priceReal;
        this.discount = discount;
        this.description = description;
        this.image = image;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPriceReal() {
        return priceReal;
    }

    public void setPriceReal(Double priceReal) {
        this.priceReal = priceReal;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
