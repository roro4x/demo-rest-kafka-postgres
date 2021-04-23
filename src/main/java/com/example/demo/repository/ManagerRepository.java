package com.example.demo.repository;

import com.example.demo.model.entity.Manager;
import org.springframework.data.repository.CrudRepository;

public interface ManagerRepository extends CrudRepository<Manager, Long> {
}
