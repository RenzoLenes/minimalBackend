package pe.edu.upc.backendminimalapp.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class CategoryProductId {
    private Integer categoryId;
    private Integer productId;

    public CategoryProductId() {
    }

    public CategoryProductId(Integer categoryId, Integer productId) {
        this.categoryId = categoryId;
        this.productId = productId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
