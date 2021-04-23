package com.example.demo.repository;

import com.example.demo.model.entity.Deal;
import org.springframework.data.repository.CrudRepository;

public interface DealRepository extends CrudRepository<Deal, Long> {
}
