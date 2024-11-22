package pe.edu.upc.backendminimalapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendminimalapp.dtos.ProductOrderDTO;
import pe.edu.upc.backendminimalapp.entities.ProductOrder;
import pe.edu.upc.backendminimalapp.entities.ProductOrderId;
import pe.edu.upc.backendminimalapp.serviceinterfaces.IProductOrderService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/productorder")
public class ProductOrderController {

    @Autowired
    private IProductOrderService pOS;

    @GetMapping
    public List<ProductOrderDTO> list(){
        return pOS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ProductOrderDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insert(@RequestBody ProductOrderDTO dto){
        ModelMapper m = new ModelMapper();
        ProductOrder po = m.map(dto, ProductOrder.class);
        pOS.insert(po);
    }

    @GetMapping("/{id}")
    public ProductOrderDTO findById(@PathVariable ProductOrderId id){
        ModelMapper m = new ModelMapper();
        ProductOrderDTO dto = m.map(pOS.findById(id),ProductOrderDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ProductOrderId id){
        pOS.deleteById(id);
    }
}
