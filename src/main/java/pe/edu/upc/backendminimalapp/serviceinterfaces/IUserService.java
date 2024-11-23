package pe.edu.upc.backendminimalapp.serviceinterfaces;

import pe.edu.upc.backendminimalapp.entities.User;

import java.util.List;

public interface IUserService {
    public void insert(User user);
    public List<User> list();
    public void update(User user);
    public void deleteById(int id);
    public User findById(int id);
}
