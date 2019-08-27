package com.conductor.example.exampleproject.rest;

import com.conductor.example.exampleproject.dto.ModelDTO;
import com.conductor.example.exampleproject.model.Model;
import com.conductor.example.exampleproject.service.ModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class TestController {

    private final ModelService modelService;

    public TestController(ModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping("/model")
    public ResponseEntity<?> getAll() {

        return ResponseEntity.ok(this.modelService.list());
    }

    @GetMapping("/model/{id}")
    public ResponseEntity<?> getOne(@PathVariable("id") Long id) {

        return ResponseEntity.ok(this.modelService.findOne(id));
    }

    @PostMapping("/model")
    public ResponseEntity<?> addOne(@RequestBody @Valid ModelDTO modelDTO) {

        final Model model = new Model(modelDTO.getName(), modelDTO.getValue());
        final Model save = this.modelService.save(model);
        return ResponseEntity.ok(save);
    }

}
