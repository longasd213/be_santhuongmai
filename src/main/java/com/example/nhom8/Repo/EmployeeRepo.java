package com.example.nhom8.Repo;

import com.example.nhom8.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
    EmployeeEntity findByEmail(String email);

    Optional<EmployeeEntity> findOneByEmailAndPassword(String email, String encodedPassword);
}
