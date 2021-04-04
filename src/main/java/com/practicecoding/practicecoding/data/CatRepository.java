package com.practicecoding.practicecoding.data;

import com.practicecoding.practicecoding.models.Cat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CatRepository extends CrudRepository<Cat, Integer> {
}
