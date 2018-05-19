package com.example.service;

import com.example.model.Type;

import java.util.List;

public interface TypeService extends CURDService<Type>{
    List<Type> getAll();
}
