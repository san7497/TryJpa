package com.interview.Repository;

import org.springframework.data.repository.CrudRepository;

import com.interview.pojo.LibraryModel;

public interface LibraryRepository extends CrudRepository<LibraryModel, Integer> {

}
