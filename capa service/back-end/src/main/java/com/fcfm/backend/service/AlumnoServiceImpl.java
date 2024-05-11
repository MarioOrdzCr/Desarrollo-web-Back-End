package com.fcfm.backend.service;

import com.fcfm.backend.model.Alumno;
import com.fcfm.backend.repository.AlumnoRepository;
import com.fcfm.backend.utils.AlumnoMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;



@Service
public class AlumnoServiceImpl implements AlumnoService{

    List<Alumno> alumnoList = new ArrayList<>();

    private final AlumnoRepository alumnoRepository;


    @Autowired
    AlumnoServiceImpl(AlumnoRepository alumnoRepository) {this.alumnoRepository = alumnoRepository;}


    @Override
    public void createAlumno(@Valid Alumno newAlumno) {
        alumnoRepository.insertar(AlumnoMapper.alumnoModelToAlumnoEntity(newAlumno));
    }

    @Override
    public List<Alumno> getAlumnoList() {
        List<com.fcfm.backend.repository.entity.Alumno> alumnosEntity = alumnoRepository.getAllAlumnos();
        return AlumnoMapper.alumnoEntityListToAlumnoModelList(alumnosEntity);
    }

    @Override
    public Alumno getAlumnoById(Long id) {
        com.fcfm.backend.repository.entity.Alumno alumnoEntity = alumnoRepository.getAlumnoById(id);
        return AlumnoMapper.alumnoEntityToAlumnoModel(alumnoEntity);
    }

    @Override
    public void updateAlumno(Long id, @Valid Alumno updatedAlumno) {
        updatedAlumno.setId(id); // Asegurando que el ID del alumno sea el correcto jejejej
        alumnoRepository.actualizar(AlumnoMapper.alumnoModelToAlumnoEntity(updatedAlumno));
    }

    @Override
    public void deleteAlumno(Long id) {
        alumnoRepository.eliminar(id);
    }

    public Alumno getAlumnoById(int id){
        com.fcfm.backend.repository.entity.Alumno alumnoEntity = alumnoRepository.getAlumnoById((long) id);
        return AlumnoMapper.alumnoEntityToAlumnoModel(alumnoEntity);
    }
}
