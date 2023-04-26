package com.example.demo.dataaccess;


import com.example.demo.entities.Deneme;


import java.util.List;

public interface IDenemeDao {


    List<Deneme> getAll();
    void add(Deneme deneme);
    void update(Deneme deneme);
    void delete(Deneme deneme);
    Deneme getByID(int id);

}
