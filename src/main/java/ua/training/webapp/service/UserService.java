package ua.training.webapp.service;

import ua.training.webapp.dto.UsersDTO;
import ua.training.webapp.entity.User;
import ua.training.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return new UsersDTO(userRepository.findAll()).getUsers();
    }

}
