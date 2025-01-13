package com.kerteszzoltan.springSeriLibrary.services;

import com.kerteszzoltan.springSeriLibrary.models.User;
import com.kerteszzoltan.springSeriLibrary.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final IUserRepository userRepository;

    @Autowired
    public UserService(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public void addNewUser(User user){
        Optional<User> userByEmail = userRepository.findUserByEmail(user.getEmail());
        if(userByEmail.isPresent()){
            throw  new IllegalStateException("Email is already exists");
        }
        userRepository.save(user);
    }

    public void deleteUser(Long userId){
        boolean exists = userRepository.existsById(userId);
        if(!exists){
            throw new IllegalStateException("This id: "+userId+" is not stored in the database");
        }
        userRepository.deleteById(userId);
    }
}
