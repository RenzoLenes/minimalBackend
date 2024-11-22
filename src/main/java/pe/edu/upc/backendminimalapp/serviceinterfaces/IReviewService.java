package pe.edu.upc.backendminimalapp.serviceinterfaces;

import pe.edu.upc.backendminimalapp.entities.Review;
import pe.edu.upc.backendminimalapp.entities.ReviewId;

import java.util.List;

public interface IReviewService {

    public void insert(Review review);
    public List<Review> list();
    public void update(Review review);
    public void deleteById(ReviewId rid);
    public Review findById(ReviewId id);
}
