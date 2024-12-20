package pe.edu.upc.backendminimalapp.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendminimalapp.entities.Role;
import pe.edu.upc.backendminimalapp.repositories.IRoleRepository;
import pe.edu.upc.backendminimalapp.serviceinterfaces.IRoleServices;

import java.util.List;


@Service
public class RoleServiceImplement implements IRoleServices {

    @Autowired
    private IRoleRepository rR;


    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int idRol) {
        rR.deleteById(idRol);
    }


    @Override
    public void update(Role role) {
        rR.save(role);
    }

    @Override
    public Role lisById(int idRole) {
        return rR.findById(idRole).orElse(new Role());
    }

}

