package com.sandy.thyeamleaf_sboot_crud.repository;

import com.sandy.thyeamleaf_sboot_crud.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    
    List<Student> findByName(String name);
    
}
