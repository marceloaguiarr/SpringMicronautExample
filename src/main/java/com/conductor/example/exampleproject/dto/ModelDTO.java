package com.conductor.example.exampleproject.dto;

import javax.validation.constraints.NotNull;

public class ModelDTO {

    @NotNull
    private String name;

    @NotNull
    private Integer value;

    public ModelDTO() {
        super();
    }

    public ModelDTO(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
