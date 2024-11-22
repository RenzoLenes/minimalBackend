package pe.edu.upc.backendminimalapp.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendminimalapp.dtos.CategoryDTO;
import pe.edu.upc.backendminimalapp.dtos.UsersDTO;
import pe.edu.upc.backendminimalapp.entities.Category;
import pe.edu.upc.backendminimalapp.entities.Users;
import pe.edu.upc.backendminimalapp.serviceinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService uS;

    @GetMapping
    public List<UsersDTO> list(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,UsersDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insert(@RequestBody UsersDTO dto){
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto,Users.class);
        uS.insert(u);
    }

    @GetMapping("/{id}")
    public UsersDTO findById(@PathVariable int id){
        ModelMapper m = new ModelMapper();
        UsersDTO dto = m.map(uS.findById(id),UsersDTO.class);
        return dto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        uS.deleteById(id);
    }
}
