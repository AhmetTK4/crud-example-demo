package com.example.demo.service;

import com.example.demo.entities.Deneme;

import java.util.List;

public interface IDenemeService {
    List<Deneme> getAll();
    void add(Deneme deneme);
    void update(Deneme deneme);
    void delete(Deneme deneme);
    Deneme getById(int id);
}
