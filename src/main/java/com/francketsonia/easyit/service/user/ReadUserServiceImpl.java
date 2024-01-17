package com.francketsonia.easyit.service.user;

import com.francketsonia.easyit.model.User;
import com.francketsonia.easyit.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReadUserServiceImpl implements ReadUserService{

    private final UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
