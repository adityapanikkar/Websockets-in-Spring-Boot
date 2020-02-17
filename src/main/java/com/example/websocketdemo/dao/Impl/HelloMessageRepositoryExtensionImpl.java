package com.example.websocketdemo.dao.Impl;


import com.example.websocketdemo.dao.HelloMessageRepositoryExtension;
import com.example.websocketdemo.pojo.HelloMessage;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class HelloMessageRepositoryExtensionImpl implements HelloMessageRepositoryExtension {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public HelloMessage getalldata(){
        Query findQuery = em.createNativeQuery("SELECT * FROM HelloMessage",HelloMessage.class);
        //findQuery.setParameter("name");
        HelloMessage hml = (HelloMessage) findQuery.getResultList().get(0);
        return hml;
    }
}
