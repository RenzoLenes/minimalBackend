package pe.edu.upc.backendminimalapp.entities;


import jakarta.persistence.*;


@Entity
@Table(name = "Category_Product")
public class CategoryProduct {

    @EmbeddedId
    private CategoryProductId id;

    @ManyToOne
    @MapsId("categoryId") // Vincula categoryId de CategoryProductId con Category
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToOne
    @MapsId("productId") // Vincula productId de CategoryProductId con Product
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;


    public CategoryProduct() {
    }

    public CategoryProduct(CategoryProductId id, Category category, Product product) {
        this.id = id;
        this.category = category;
        this.product = product;
    }

    public CategoryProductId getId() {
        return id;
    }

    public void setId(CategoryProductId id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
