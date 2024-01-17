package com.francketsonia.easyit.service.user;

import com.francketsonia.easyit.model.User;
import com.francketsonia.easyit.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UpdateUserServiceImpl implements UpdateUserService {

    private final UserRepository userRepository;

    @Override
    public User updateUser(Long userId, User updatedUser) {
        return userRepository.findById(userId)
                .map(existingUser -> {
                    existingUser.setName(updatedUser.getName());
                    existingUser.setFirst_name(updatedUser.getFirst_name());
                    existingUser.setEmail(updatedUser.getEmail());
                    existingUser.setPassword(updatedUser.getPassword());
                    existingUser.setAddress(updatedUser.getAddress());
                    existingUser.setPhone(updatedUser.getPhone());

                    return userRepository.save(existingUser);
                })
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé avec l'ID : " + userId));
    }
}
