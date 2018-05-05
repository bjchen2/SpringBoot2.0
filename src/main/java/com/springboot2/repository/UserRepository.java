package com.springboot2.repository;

import com.springboot2.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created By Cx On 2018/5/5 13:24
 */
//Repository:仓库，该注解说明该类是Spring组件，所以在SpringIOC容器扫描时会扫描并创建该类的bean
@Repository
public class UserRepository {

    //采用内存存储，因为该类是Spring的bean，所以是单例的，为了防止高并发情况，使用ConcurrentMap
    private final ConcurrentMap<Integer,User> repository = new ConcurrentHashMap<>();
    //定义一个Id生成器，生成自增长的Id
    private final static AtomicInteger idGenerator = new AtomicInteger();

    public boolean save(User user){
        //从1开始，将当前值加一返回，第一次调用返回1
        int id = idGenerator.incrementAndGet();
        user.setId(id);
        //返回该键对应的值，若不存在则返回null并新建一个映射关系（若存在相当于get方法）
        return repository.put(id,user) == null;
    }

    public Collection<User> findAll(){
        //返回此映射中值（仅返回值，不返回键）的 Collection
        return repository.values();
    }
}
