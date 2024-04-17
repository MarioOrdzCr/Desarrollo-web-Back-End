package com.fcfm.backend.service;

import com.fcfm.backend.model.Alumno;

import java.util.List;

public interface AlumnoService {

    void createAlumno(Alumno alumno);

    List<Alumno> getAlumnoList();
    Alumno getAlumnoById(int id);

}
