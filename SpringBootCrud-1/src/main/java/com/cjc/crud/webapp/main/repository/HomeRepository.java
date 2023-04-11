package com.cjc.crud.webapp.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.crud.webapp.main.model.Student;
@Repository
public interface HomeRepository extends CrudRepository<Student,Integer> {

}
