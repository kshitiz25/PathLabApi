package com.PathLab.Nirog.Repository;

import com.PathLab.Nirog.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Optional<Patient> findById(Long id);
}
