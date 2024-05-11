CREATE DATABASE universidades

DROP TABLE alumno

CREATE TABLE alumno(
	alumno_id INTEGER IDENTITY(1,1),
	primer_nombre VARCHAR(30),
	segundo_nombre VARCHAR(30),
	apellido_pat VARCHAR(30),
	apellido_mat VARCHAR(30),
	fecha_nac DATE,
	curp CHAR(16),
	email VARCHAR(50),
)

SELECT * FROM alumno