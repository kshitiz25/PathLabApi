package com.PathLab.Nirog.Service;

import com.PathLab.Nirog.Patient;
import com.PathLab.Nirog.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

        @Autowired
        private PatientRepository patientRepository;

        public Patient savePatient(Patient patient) {
            return patientRepository.save(patient);
        }

        public List<Patient> getAllPatients() {
            return patientRepository.findAll();
        }

        public Optional<Patient> getPatientById(Long id) {
            return patientRepository.findById(id);
        }

        public void deletePatient(Long id) {
            patientRepository.deleteById(id);
        }

}
