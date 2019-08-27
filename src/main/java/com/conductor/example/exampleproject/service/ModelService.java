package com.conductor.example.exampleproject.service;

import com.conductor.example.exampleproject.model.Model;
import com.conductor.example.exampleproject.repository.ModelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {

    private final ModelRepository modelRepository;

    public ModelService(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    public Model findOne(Long id) {
        return this.modelRepository.findById(id).orElse(null);
    }

    public List<Model> list() {

        return this.modelRepository.findAll();
    }

    public Model save(Model model) {

        return this.modelRepository.save(model);
    }
}
