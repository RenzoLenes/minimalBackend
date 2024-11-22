package pe.edu.upc.backendminimalapp.serviceinterfaces;

import pe.edu.upc.backendminimalapp.entities.Users;

import java.util.List;

public interface IUserService {
    public void insert(Users users);
    public List<Users> list();
    public void update(Users users);
    public void deleteById(int id);
    public Users findById(int id);
}
