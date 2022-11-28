package com.tech.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tech.admin.model.Student;

@Repository
public interface Myrepo  extends CrudRepository<Student,String>
{

}
