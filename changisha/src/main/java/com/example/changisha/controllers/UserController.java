package com.example.changisha.controllers;

import com.example.changisha.entities.User;
import com.example.changisha.exceptions.UserNotFoundException;
import com.example.changisha.repositories.UserRepository;
import com.example.changisha.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;
    @GetMapping(value = "/users")
    public List<User> getAllUsers(){
        return userService.getUsers();

    }
    @GetMapping(value = "/users/{id}")
    public User getSpecificUser(@PathVariable("id") int userId) throws UserNotFoundException {
        return userService.getUser(userId);

    }



    //@PutMapping("{id}")
    //@DeleteMapping("{id}")
    @PostMapping

    User addNewUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @PutMapping(value = "/users/{userid}")
    public User updateUser(@RequestBody User user) throws UserNotFoundException {
        return userService.updateUser(user.getUserid(), user);
    }
//    @DeleteMapping (value = "/users/{id}")
//    public void  deleteStudent(@PathVariable(value="id") int userId)throws UserNotFoundException{
//        return UserService.deleteUser(userId);
//    }
    // Delete a Note
    @DeleteMapping("/users/{userid}")
    public ResponseEntity<?> deleteBook(@PathVariable(value = "userid") int userId) throws UserNotFoundException {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));

        userRepository.delete(user);

        return ResponseEntity.ok().build();
    }

}
