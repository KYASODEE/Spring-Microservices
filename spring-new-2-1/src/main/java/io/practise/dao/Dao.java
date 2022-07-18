package io.practise.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import io.swagger.models.Model;

@Repository
@Primary
public interface Dao extends MongoRepository<Model, String>{

	void insert(io.practise.model.Model model);

	void update(io.practise.model.Model model);

	void save(io.practise.model.Model model);

	

}