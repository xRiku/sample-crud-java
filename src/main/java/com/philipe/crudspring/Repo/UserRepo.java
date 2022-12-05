package com.philipe.crudspring.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.philipe.crudspring.Models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
     
}
