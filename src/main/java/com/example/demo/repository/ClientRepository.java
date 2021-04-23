package com.example.demo.repository;

import com.example.demo.model.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {
}
