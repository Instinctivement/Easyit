package com.francketsonia.easyit.service.user;

import com.francketsonia.easyit.model.User;

public interface UpdateUserService {

    User updateUser(Long userId, User updatedUser);

}
