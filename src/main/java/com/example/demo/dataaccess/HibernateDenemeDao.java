package com.example.demo.dataaccess;

import com.example.demo.entities.Deneme;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;
@Repository
public class HibernateDenemeDao implements IDenemeDao{
    private EntityManager entityManager;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public HibernateDenemeDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Deneme> getAll() {
       Session session =  entityManager.unwrap(Session.class);
       List<Deneme> list = session.createQuery("from Deneme",Deneme.class).getResultList();
    return list;
    }

    @Override
    public void add(Deneme deneme) {
    Session session =entityManager.unwrap((Session.class));
    session.saveOrUpdate(deneme);
    }

    @Override
    public void update(Deneme deneme) {
        Session session =entityManager.unwrap((Session.class));
        session.saveOrUpdate(deneme);
    }

    @Override
    public void delete(Deneme deneme) {
        Session session =entityManager.unwrap((Session.class));
        Deneme denemeToDelete = session.get(Deneme.class, deneme.getId());
        session.delete(denemeToDelete);
    }

    @Override
    public Deneme getByID(int id) {
        Session session=entityManager.unwrap(Session.class);
        Deneme deneme = session.get(Deneme.class,id);
        return deneme;
    }
}
