package pe.edu.upc.backendminimalapp.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendminimalapp.dtos.CategoryProductDTO;
import pe.edu.upc.backendminimalapp.dtos.ReviewDTO;
import pe.edu.upc.backendminimalapp.entities.CategoryProduct;
import pe.edu.upc.backendminimalapp.entities.CategoryProductId;
import pe.edu.upc.backendminimalapp.entities.Review;
import pe.edu.upc.backendminimalapp.entities.ReviewId;
import pe.edu.upc.backendminimalapp.serviceinterfaces.IReviewService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private IReviewService rS;

    @GetMapping
    public List<ReviewDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ReviewDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insert(@RequestBody ReviewDTO dto){
        ModelMapper m = new ModelMapper();
        Review r = m.map(dto, Review.class);
        rS.insert(r);
    }

    @GetMapping("/{id}")
    public ReviewDTO findById(@PathVariable ReviewId id){
        ModelMapper m = new ModelMapper();
        ReviewDTO dto = m.map(rS.findById(id),ReviewDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ReviewId id){
        rS.deleteById(id);
    }
}
