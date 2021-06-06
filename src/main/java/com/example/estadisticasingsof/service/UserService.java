package com.example.estadisticasingsof.service;

import com.example.estadisticasingsof.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    public Iterable<User> findAll();
    public Page<User> findAll(Pageable pageable);
    public User findById(Long id) throws Exception;
    public User save(User user);
    public  void deleteById(Long id);
    public void insert();
    public List<User> findAlls();



}
