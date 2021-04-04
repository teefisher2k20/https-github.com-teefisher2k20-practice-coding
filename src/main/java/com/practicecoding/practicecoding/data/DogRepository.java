package com.practicecoding.practicecoding.data;

import com.practicecoding.practicecoding.models.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<Dog, Integer> {

}
