package pe.edu.upc.backendminimalapp.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendminimalapp.dtos.CategoryDTO;
import pe.edu.upc.backendminimalapp.dtos.CategoryProductDTO;
import pe.edu.upc.backendminimalapp.entities.Category;
import pe.edu.upc.backendminimalapp.entities.CategoryProduct;
import pe.edu.upc.backendminimalapp.entities.CategoryProductId;
import pe.edu.upc.backendminimalapp.serviceinterfaces.ICategoryProductService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categoryproduct")
public class CategoryProductController {

    @Autowired
    private ICategoryProductService  cPS;

    @GetMapping
    public List<CategoryProductDTO> list(){
        return cPS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,CategoryProductDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insert(@RequestBody CategoryProductDTO dto){
        ModelMapper m = new ModelMapper();
        CategoryProduct cp = m.map(dto, CategoryProduct.class);
        cPS.insert(cp);
    }

    @GetMapping("/{id}")
    public CategoryProductDTO findById(@PathVariable CategoryProductId id){
        ModelMapper m = new ModelMapper();
        CategoryProductDTO dto = m.map(cPS.findById(id),CategoryProductDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable CategoryProductId id){
        cPS.deleteById(id);
    }
}
