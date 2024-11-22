package pe.edu.upc.backendminimalapp.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backendminimalapp.entities.Review;
import pe.edu.upc.backendminimalapp.entities.Users;
import pe.edu.upc.backendminimalapp.repositories.IUserRepository;
import pe.edu.upc.backendminimalapp.serviceinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {

    @Autowired
    private IUserRepository uR;

    @Override
    public void insert(Users users) {
        uR.save(users);
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void update(Users users) {
        uR.save(users);
    }

    @Override
    public void deleteById(int id) {
        uR.deleteById(id);
    }

    @Override
    public Users findById(int id) {
        return uR.findById(id).orElse(new Users());
    }
}
