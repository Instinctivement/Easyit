package com.francketsonia.easyit.service.user;

import com.francketsonia.easyit.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeleteUserServiceImpl implements DeleteUserService {

    private final UserRepository userRepository;

    @Override
    public String deleteUser(Long userId) {
        userRepository.deleteById(userId);
        return "Utilisateur supprimé avec succès";
    }

}
