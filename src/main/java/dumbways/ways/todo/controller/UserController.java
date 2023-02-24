package dumbways.ways.todo.controller;

import dumbways.ways.todo.entity.User;
import dumbways.ways.todo.repository.UserRepository;
import dumbways.ways.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public Iterable<User> findAll() {
        return userService.findAll();
    };

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User findOne(@PathVariable("id") long id) {
        return userService.findOne(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<User> findById(@PathVariable("id") long id, @RequestBody User user) {
        User getUser = userRepository.findById(id);

        getUser.setName(user.getName());
        getUser.setEmail(user.getEmail());
        getUser.setPassword(user.getPassword());
        getUser.setProfile(user.getProfile());
        getUser.setTodo(user.getTodo());

        User updateUser = userRepository.save(getUser);

        return ResponseEntity.ok().body(updateUser);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public void removeOne(@PathVariable("id") long id) {
        userService.removeOne(id);
    }

}
