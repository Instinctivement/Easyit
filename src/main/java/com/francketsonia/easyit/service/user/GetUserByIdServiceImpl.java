package com.francketsonia.easyit.service.user;

import com.francketsonia.easyit.model.User;
import com.francketsonia.easyit.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetUserByIdServiceImpl implements GetUserByIdService{

    private final UserRepository userRepository;

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new RuntimeException("Ulisateur non trouvé avec l'ID : " + userId));
    }

}
