package com.restapi.people.rest.api.repository;

import com.restapi.people.rest.api.model.UserModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
}
