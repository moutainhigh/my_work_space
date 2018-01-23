package com.match.dao.base.impl;

import com.match.dao.base.MongoBaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public abstract class MongoBaseDaoImpl<T> implements MongoBaseDao<T> {


    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public void save(T t) {
        mongoTemplate.save(t);
    }

    @Override
    public void remove(String id) {
        mongoTemplate.remove(new Query(Criteria.where("id").is(id)), getEntityClass());
    }

    @Override
    public T select(String id) {
        return mongoTemplate.findById(id, getEntityClass());
    }

    @Override
    public List<T> select(List<String> ids) {
        return mongoTemplate.find(new Query(Criteria.where("id").in(ids)), getEntityClass());
    }




}
