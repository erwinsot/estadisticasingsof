package com.example.estadisticasingsof.dao;

import com.example.estadisticasingsof.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository  extends MongoRepository<User,Long> {
}
