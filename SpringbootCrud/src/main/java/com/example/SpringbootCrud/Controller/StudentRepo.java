package com.example.SpringbootCrud.Controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentModel,Long> {

}
