package com.example.estadisticasingsof.service;

import com.example.estadisticasingsof.dao.UserRepository;
import com.example.estadisticasingsof.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User findById(Long id)throws Exception {
        return userRepository.findById(id).orElseThrow(()->new Exception("El usuario no exsite"));
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void insert() {

    }

    @Override
    public List<User> findAlls() {

        return userRepository.findAll();
    }
}
