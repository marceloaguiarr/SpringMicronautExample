package com.conductor.example.exampleproject.repository;

import com.conductor.example.exampleproject.model.Model;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
}
