package dumbways.ways.todo.service;

import dumbways.ways.todo.entity.User;
import dumbways.ways.todo.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public User findOne(long id) {
        return userRepository.findById(id);
    }

    public void removeOne(long id) {
        userRepository.deleteById(id);
    }

}
