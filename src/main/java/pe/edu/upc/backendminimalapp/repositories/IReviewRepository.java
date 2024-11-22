package pe.edu.upc.backendminimalapp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.backendminimalapp.entities.Review;
import pe.edu.upc.backendminimalapp.entities.ReviewId;

@Repository
public interface IReviewRepository extends JpaRepository<Review, ReviewId> {
}
