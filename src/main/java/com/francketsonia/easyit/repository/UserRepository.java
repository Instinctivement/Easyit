package com.francketsonia.easyit.repository;

import com.francketsonia.easyit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
