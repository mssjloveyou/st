package com.example.demo.controller;

import com.example.demo.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Timer;
import java.util.UUID;

@Service
public class TestService {
    @Autowired
    private TestDao dao;

    @Transactional
    public void save(){
        Test test = new Test();
        test.setName(UUID.randomUUID().toString());
        dao.save(test);
        Timer timer = new Timer();
        timer.schedule(null,1l);
        timer.notify();
    }

//    @Transactional(timeout = 10)
    public Test test(){
        List<Test> list = dao.findAll();
        return list.get(0);
    }
}
