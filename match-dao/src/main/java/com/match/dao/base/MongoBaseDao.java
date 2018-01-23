package com.match.dao.base;

import java.util.List;

public interface MongoBaseDao<T> {

    Class<T> getEntityClass();

    void save(T t);

    void remove(String key);

    T select(String key);

    List<T> select(List<String> keys);


}
