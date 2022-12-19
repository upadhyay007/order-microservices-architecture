package com.company.delivery.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.delivery.model.Users;
@Repository
public interface UserRepositroy extends CrudRepository<Users, Integer> {
 Optional<Users> findByUserid(String userId);
}
