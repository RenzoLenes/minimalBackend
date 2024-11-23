package pe.edu.upc.backendminimalapp.serviceinterfaces;


import pe.edu.upc.backendminimalapp.entities.Role;

import java.util.List;

public interface IRoleServices {

    public void insert(Role role);

    public List<Role> list();

    public void delete(int id);

    public void update(Role idRole);

    public Role lisById(int idRole);



}
