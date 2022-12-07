package com.philipe.crudspring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.philipe.crudspring.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
