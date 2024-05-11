package com.fcfm.backend.service;

import com.fcfm.backend.model.Alumno;
import jakarta.validation.Valid;

import java.util.List;

public interface AlumnoService {

    void createAlumno(Alumno alumno);

    List<Alumno> getAlumnoList();

    Alumno getAlumnoById(Long id);

    void updateAlumno(Long id, @Valid Alumno updatedAlumno);

    void deleteAlumno(Long id);

    Alumno getAlumnoById(int id);

}
