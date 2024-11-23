package pe.edu.upc.backendminimalapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backendminimalapp.dtos.RoleDTO;
import pe.edu.upc.backendminimalapp.entities.Role;
import pe.edu.upc.backendminimalapp.serviceinterfaces.IRoleServices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Roles")
public class RoleController {

    @Autowired
    private IRoleServices rs;

    @PostMapping
    public void registrar(@RequestBody RoleDTO dto){

        ModelMapper m = new ModelMapper();
        Role d = m.map(dto, Role.class);
        rs.insert(d);

    }

    @GetMapping
    public List<RoleDTO> listar(){
        return rs.list().stream().map(x->{ModelMapper m=new ModelMapper();
            return  m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());

    }

    @GetMapping("/{id}")
    public RoleDTO getById(@PathVariable("id") int id){
        ModelMapper m = new ModelMapper();
        RoleDTO dto=m.map(rs.lisById(id), RoleDTO.class);
        return dto;
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        rs.delete(id);
    }

    @PutMapping
    public void modificar(@RequestBody RoleDTO dto) {
        ModelMapper m = new ModelMapper();
        Role d = m.map(dto, Role.class);
        rs.update(d);
    }

}
