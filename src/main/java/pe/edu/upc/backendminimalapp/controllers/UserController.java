package pe.edu.upc.backendminimalapp.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendminimalapp.dtos.UsersDTO;
import pe.edu.upc.backendminimalapp.entities.User;
import pe.edu.upc.backendminimalapp.serviceinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService uS;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping
    public List<UsersDTO> list(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,UsersDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody UsersDTO dto) {
        ModelMapper m = new ModelMapper();
        User u = m.map(dto, User.class);
        String encodedPassword = passwordEncoder.encode(u.getPassword());
        u.setPassword(encodedPassword);
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
