package pe.edu.upc.backendminimalapp.dtos;

import pe.edu.upc.backendminimalapp.entities.Category;
import pe.edu.upc.backendminimalapp.entities.CategoryProductId;
import pe.edu.upc.backendminimalapp.entities.Product;

public class CategoryProductDTO {

    private CategoryProductId id;

    private Category category;

    private Product product;

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
