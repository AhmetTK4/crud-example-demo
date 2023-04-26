package com.example.demo.service;

import com.example.demo.dataaccess.IDenemeDao;
import com.example.demo.entities.Deneme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class DenemeManager implements IDenemeService{
    private IDenemeDao denemeDao;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public DenemeManager(IDenemeDao denemeDao) {
        this.denemeDao = denemeDao;
    }

    @Override
    @Transactional
    public List<Deneme> getAll() {
        return this.denemeDao.getAll();
    }

    @Override
    @Transactional
    public void add(Deneme deneme) {
this.denemeDao.add(deneme);
    }

    @Override
    @Transactional
    public void update(Deneme deneme) {
        int a = deneme.getId();
        if(a<3){
            System.out.println("3 madde degisemez");
        }
this.denemeDao.update(deneme);
    }

    @Override
    @Transactional
    public void delete(Deneme deneme) {
this.denemeDao.delete(deneme);
    }
    @Transactional
    @Override
    public Deneme getById(int id) {
       return this.denemeDao.getByID(id);
    }

}
