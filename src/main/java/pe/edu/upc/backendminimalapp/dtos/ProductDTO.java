package pe.edu.upc.backendminimalapp.dtos;

public class ProductDTO {

    private Integer product_id;

    private String name;

    private Double priceReal;

    private Double discount;

    private String description;

    private String image;

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
