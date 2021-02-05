package com.example.demo.repos;

import com.example.demo.domain.Doctor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface DoctorRepository extends CrudRepository<Doctor, Integer> {
    List<Doctor> findBySpecialization(String specialization);
}
