package com.fcfm.backend.repository;

import com.fcfm.backend.repository.entity.Alumno;

import java.util.List;

public interface AlumnoRepository {
    void insertar(Alumno alumno);
    Alumno getAlumnoById(Long id);

    List<Alumno> getAllAlumnos();

    void eliminar(Long id);

    void actualizar(Alumno alumno);
}
