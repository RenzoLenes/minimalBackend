package pe.edu.upc.backendminimalapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendminimalapp.dtos.CategoryDTO;
import pe.edu.upc.backendminimalapp.dtos.ProductDTO;
import pe.edu.upc.backendminimalapp.entities.Category;
import pe.edu.upc.backendminimalapp.entities.Product;
import pe.edu.upc.backendminimalapp.serviceinterfaces.IProductService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService pS;

    @GetMapping
    public List<ProductDTO> list(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ProductDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insert(@RequestBody ProductDTO dto){
        ModelMapper m = new ModelMapper();
        Product p = m.map(dto,Product.class);
        pS.insert(p);
    }

    @GetMapping("/{id}")
    public ProductDTO findById(@PathVariable int id){
        ModelMapper m = new ModelMapper();
        ProductDTO dto = m.map(pS.findById(id),ProductDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        pS.deleteById(id);
    }


    @GetMapping("/findByCategory")
    public List<ProductDTO> findByCategory(@RequestParam String category){
        return pS.searchByCategory(category).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ProductDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/searchByNameCategory")
    public List<ProductDTO> findByName(@RequestParam String name, @RequestParam String category){
        return pS.searchByName(name,category).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ProductDTO.class);
        }).collect(Collectors.toList());
    }
}
