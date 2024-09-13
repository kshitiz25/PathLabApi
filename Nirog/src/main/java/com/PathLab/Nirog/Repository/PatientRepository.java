package com.PathLab.Nirog.Repository;

import com.PathLab.Nirog.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
