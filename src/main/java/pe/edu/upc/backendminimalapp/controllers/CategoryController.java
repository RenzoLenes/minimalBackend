package pe.edu.upc.backendminimalapp.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendminimalapp.dtos.CategoryDTO;
import pe.edu.upc.backendminimalapp.entities.Category;
import pe.edu.upc.backendminimalapp.serviceinterfaces.ICategoryService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService cS;


    @GetMapping
    public List<CategoryDTO> list(){
        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,CategoryDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insert(@RequestBody CategoryDTO dto){
        ModelMapper m = new ModelMapper();
        Category c = m.map(dto,Category.class);
        cS.insert(c);
    }

    @GetMapping("/{id}")
    public CategoryDTO findById(@PathVariable int id){
        ModelMapper m = new ModelMapper();
        CategoryDTO dto = m.map(cS.findById(id),CategoryDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        cS.deleteById(id);
    }
}
