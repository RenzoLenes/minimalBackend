package pe.edu.upc.backendminimalapp.entities;


import jakarta.persistence.Embeddable;

import java.time.LocalDate;


@Embeddable
public class ProductOrderId {
    private Integer productId;
    private Integer userId;
    private LocalDate date;

    public ProductOrderId() {
    }

    public ProductOrderId(Integer productId, Integer userId, LocalDate date) {
        this.productId = productId;
        this.userId = userId;
        this.date = date;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
