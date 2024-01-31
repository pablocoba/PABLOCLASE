
/*EJERCICIO1*/
DROP DATABASE IF EXISTS academia;
CREATE DATABASE academia;
USE academia;
DROP TABLE IF EXISTS ALUMNOS;
DROP TABLE IF EXISTS CURSOS;
DROP TABLE IF EXISTS PROFESORES;

CREATE TABLE PROFESORES(
	NIF VARCHAR(10) PRIMARY KEY,
	Nombre VARCHAR(40) UNIQUE,
	Apellido1 VARCHAR(20) NOT NULL,
	Apellido2 VARCHAR(20) NOT NULL,
	Direccion VARCHAR(100) NOT NULL,
	Titulación VARCHAR(300) NOT NULL,
	Salario_Mes DECIMAL(6,2) NOT NULL
);



CREATE TABLE CURSOS (
	id INT AUTO_INCREMENT PRIMARY KEY,
	Nombre VARCHAR(20) UNIQUE,
	Max_Alumn INT NOT NULL,
	Fecha_In DATE NOT NULL,
	Fecha_Fin DATE NOT NULL,
    CHECK(Fecha_In<=Fecha_Fin),
	Num_Horas INT NOT NULL CHECK (Num_Horas>0),
	NIF_Profesor VARCHAR(10) NOT NULL,
	FOREIGN KEY (NIF_Profesor) REFERENCES PROFESORES(NIF) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE ALUMNOS(
	NIF VARCHAR(10) PRIMARY KEY,
	Nombre VARCHAR(40) NOT NULL,
	Apellido1 VARCHAR(20) NOT NULL,
	Apellido2 VARCHAR(20) NOT NULL,
	Direccion VARCHAR(100) NOT NULL,
	Sexo ENUM('H', 'M') NOT NULL,
	Fecha_de_Nacimiento DATE NOT NULL,
	Curso INT NOT NULL,
	FOREIGN KEY (Curso) REFERENCES CURSOS(id) ON DELETE CASCADE ON UPDATE CASCADE
);


/*EJERCICIO2*/

/*1.Crea un nuevo atributo llamado Edad de tipo numérico a la tabla ALUMNOS.*/
ALTER TABLE ALUMNOS ADD Edad VARCHAR(2) NOT NULL;

/*2.Modifica el campo que has creado anteriormente para que la edad del alumno o alumna esté comprendida entre 14 y 65 años.*/
ALTER TABLE ALUMNOS ADD CONSTRAINT Edad CHECK(Edad>=14 AND Edad <=65);

/*Modifica el campo Número de horas del CURSO de manera que solo pueda haber cursos con 30, 40 o 60 horas.*/
ALTER TABLE CURSOS MODIFY Num_Horas ENUM('30','40','60') NOT NULL;

/*4.No podemos añadir un curso si su número máximo de alumnos es inferior a 15.*/
ALTER TABLE CURSOS ADD CONSTRAINT Max_Alumn CHECK (Max_Alumn>15);

/*5.Elimina la restricción que controla los valores que puede tomar el atributo Sexo.*/
ALTER TABLE ALUMNOS MODIFY Sexo CHAR(1) NOT NULL;

/*6.Elimina la columna Dirección de la tabla PROFESORES.*/
ALTER TABLE PROFESORES DROP COLUMN Direccion;

/*7.Cambia la clave primaria de la tabla PROFESORES por Nombre y Apellidos.*/
ALTER TABLE CURSOS DROP CONSTRAINT `cursos_ibfk_1`;
ALTER TABLE PROFESORES DROP PRIMARY KEY, ADD PRIMARY KEY (Nombre, Apellido1, Apellido2);
ALTER TABLE CURSOS CHANGE NIF_Profesor NomP VARCHAR(40) NOT NULL;
ALTER TABLE CURSOS ADD COLUMN ApeP VARCHAR(30) NOT NULL;
ALTER TABLE CURSOS ADD COLUMN ApeP2 VARCHAR(30) NOT NULL;
ALTER TABLE CURSOS ADD FOREIGN KEY (NomP,ApeP,ApeP2) REFERENCES PROFESORES (Nombre, Apellido1, Apellido2);
ALTER TABLE PROFESORES ADD COLUMN Telefono VARCHAR(9) NOT NULL;

/*8.Renombra la tabla PROFESORES por TUTORES.*/
ALTER TABLE PROFESORES RENAME TO TUTORES; 

CREATE INDEX idx_tlf ON TUTORES(Telefono);

/*9.Elimina la tabla ALUMNOS.*/
DROP TABLE ALUMNOS;

/*ESTOS SON VALORES PARA COMPROBAR QUE LOS LIMITADORES DE EDAD, FECHA... FUNCIONAN*/
/*aquí debería fallar porque la edad es menor a 14*/
INSERT INTO ALUMNOS (NIF, Nombre, Apellido1, Apellido2, Direccion, Edad, Sexo, Fecha_de_Nacimiento, Curso)
VALUES ('100000000', 'pablo','coba','lodin','calle bravo murillo','13','H',"20010828", 2);

/*aquí debería fallar porque la fechaFin es menor que FechaIn*/
INSERT INTO CURSOS (Nombre, Max_Alumn, Fecha_In, Fecha_Fin, Num_Horas, NIF_Profesor)
VALUES ('segundo', 20, "20020202", "2002-02-01", 30, '101010100');

/*aquí debería fallar por el nº de horas de cursos*/
INSERT INTO CURSOS (Nombre, Max_Alumn, Fecha_In, Fecha_Fin, Num_Horas, NIF_Profesor)
VALUES ('segundo', 20, "20020202", "2002-02-03", 20, '101010100');