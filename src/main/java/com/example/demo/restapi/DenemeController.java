package com.example.demo.restapi;

import com.example.demo.entities.Deneme;
import com.example.demo.service.IDenemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DenemeController {
    private IDenemeService denemeService;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public DenemeController(IDenemeService denemeService) {
        this.denemeService = denemeService;
    }

    @GetMapping("/deneme")

    public List<Deneme> get(){
        return denemeService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Deneme deneme){
        denemeService.add(deneme);
    }

    @PostMapping("/update")
    public void update(@RequestBody Deneme deneme){
        denemeService.update(deneme);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Deneme deneme){
        denemeService.delete(deneme);
    }

    @GetMapping("/deneme/{id}")
    public Deneme getById(@PathVariable int id){
        return denemeService.getById(id);
    }


}
