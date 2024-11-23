package pe.edu.upc.backendminimalapp.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendminimalapp.entities.User;
import pe.edu.upc.backendminimalapp.repositories.IUserRepository;
import pe.edu.upc.backendminimalapp.serviceinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {

    @Autowired
    private IUserRepository uR;

    @Override
    public void insert(User user) {
        uR.save(user);
    }

    @Override
    public List<User> list() {
        return uR.findAll();
    }

    @Override
    public void update(User user) {
        uR.save(user);
    }

    @Override
    public void deleteById(int id) {
        uR.deleteById(id);
    }

    @Override
    public User findById(int id) {
        return uR.findById(id).orElse(new User());
    }
}
