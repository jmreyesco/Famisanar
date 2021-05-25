package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Users;

public interface IUserDao extends CrudRepository<Users, Long> {

	public Users findByUsername(String username);

}
