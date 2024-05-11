package com.fcfm.backend.utils;

import com.fcfm.backend.repository.entity.Alumno;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class AlumnoMapper {
    public static com.fcfm.backend.model.Alumno alumnoEntityToAlumnoModel(Alumno alumno) {
        com.fcfm.backend.model.Alumno model = new com.fcfm.backend.model.Alumno();
        model.setPrimerNombre(alumno.getPrimerNombre());
        model.setSegundoNombre(alumno.getSegundoNombre());
        model.setApellidoPat(alumno.getApellidoPat());
        model.setApellidoMat(alumno.getApellidoMat());
        model.setFechaNac(alumno.getFechaNac().toString());
        model.setCurp(alumno.getCurp());
        model.setEmail(alumno.getEmail());
        return model;
    }

    public static Alumno alumnoModelToAlumnoEntity(com.fcfm.backend.model.Alumno alumno) {
        Alumno entity = new com.fcfm.backend.repository.entity.Alumno();
        entity.setPrimerNombre(alumno.getPrimerNombre());
        entity.setSegundoNombre(alumno.getSegundoNombre());
        entity.setApellidoPat(alumno.getApellidoPat());
        entity.setApellidoMat(alumno.getApellidoMat());
        entity.setCurp(alumno.getCurp());
        entity.setEmail(alumno.getEmail());
        entity.setFechaNac(Date.valueOf(alumno.getFechaNac()));

        return entity;
    }

    public static List<com.fcfm.backend.model.Alumno> alumnoEntityListToAlumnoModelList(List<Alumno> alumnosEntity) {
        List<com.fcfm.backend.model.Alumno> alumnosModel = new ArrayList<>();

        for (com.fcfm.backend.repository.entity.Alumno alumnoEntity : alumnosEntity) {
            com.fcfm.backend.model.Alumno alumnoModel = alumnoEntityToAlumnoModel(alumnoEntity);
            alumnosModel.add(alumnoModel);
        }

        return alumnosModel;
    }
}


