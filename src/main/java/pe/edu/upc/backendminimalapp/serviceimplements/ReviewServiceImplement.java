package pe.edu.upc.backendminimalapp.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendminimalapp.entities.Review;
import pe.edu.upc.backendminimalapp.entities.ReviewId;
import pe.edu.upc.backendminimalapp.repositories.IReviewRepository;
import pe.edu.upc.backendminimalapp.serviceinterfaces.IReviewService;

import java.util.List;

@Service
public class ReviewServiceImplement implements IReviewService {

    @Autowired
    private IReviewRepository rR;

    @Override
    public void insert(Review review) {
        rR.save(review);
    }

    @Override
    public List<Review> list() {
        return rR.findAll();
    }

    @Override
    public void update(Review review) {
        rR.save(review);
    }

    @Override
    public void deleteById(ReviewId rid) {
        rR.deleteById(rid);
    }

    @Override
    public Review findById(ReviewId rid) {
        return rR.findById(rid).orElse(new Review());
    }
}
