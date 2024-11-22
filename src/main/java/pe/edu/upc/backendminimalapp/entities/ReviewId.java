package pe.edu.upc.backendminimalapp.entities;


import jakarta.persistence.Embeddable;

import java.time.LocalDateTime;


@Embeddable
public class ReviewId {
    private Integer productId;
    private Integer userId;
    private LocalDateTime date;

    public ReviewId() {
    }

    public ReviewId(Integer productId, Integer userId, LocalDateTime date) {
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
