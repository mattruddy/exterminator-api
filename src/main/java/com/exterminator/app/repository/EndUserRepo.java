package com.exterminator.app.repository;

import com.exterminator.app.model.EndUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EndUserRepo extends JpaRepository<EndUser, Long> {
    EndUser findByUsernameIgnoreCase(String username);
    EndUser findByEmailIgnoreCase(String email);
}
