DROP DATABASE IF EXISTS BD04;
CREATE DATABASE BD04;
USE BD04;

ALTER TABLE ALUMNADO DROP CONSTRAINT Cod_alum_PK;
ALTER TABLE ALUMNADO DROP CONSTRAINT Cod_Curso_FK;
ALTER TABLE CURSOS DROP CONSTRAINT Cod_Profe_FK;
ALTER TABLE CURSOS DROP CONSTRAINT Cod_Curso_PK;
ALTER TABLE PROFESORADO DROP CONSTRAINT Cod_Profe_PK;

DROP TABLE IF EXISTS PROFESORADO;
CREATE TABLE PROFESORADO
( Codigo INT, 
  Nombre VARCHAR(30), 
  Apellidos VARCHAR(30), 
  DNI VARCHAR(10), 
  Especialidad VARCHAR(20),
  Fecha_Nac DATE,
  Antiguedad INT,
  CONSTRAINT Cod_Profe_PK PRIMARY KEY (Codigo)
);  
DROP TABLE IF EXISTS CURSOS;
CREATE TABLE CURSOS
( Codigo INT, 
  Nombre VARCHAR(20), 
  Cod_Profe INT, 
  Max_Alumn INT, 
  Fecha_Inic DATE, 
  Fecha_Fin DATE, 
  Num_Horas INT,
  CONSTRAINT Cod_Curso_PK PRIMARY KEY (Codigo),    
  CONSTRAINT Cod_Profe_FK
    FOREIGN KEY (Cod_Profe)
    REFERENCES PROFESORADO(Codigo)
);

DROP TABLE IF EXISTS ALUMNADO_NUEVO;        
CREATE TABLE ALUMNADO_NUEVO
( Nombre VARCHAR(30), 
  Apellidos VARCHAR(30), 
  Sexo VARCHAR(1), 
  Fecha_Nac DATE
);

DROP TABLE IF EXISTS ALUMNADO; 
CREATE TABLE ALUMNADO
( Codigo INT AUTO_INCREMENT, 
  Nombre VARCHAR(30), 
  Apellidos VARCHAR(30), 
  Sexo VARCHAR(1), 
  Fecha_Nac DATE, 
  Cod_Curso INT,
  CONSTRAINT Cod_alum_PK PRIMARY KEY (Codigo),    
  CONSTRAINT Cod_Curso_FK
    FOREIGN KEY (Cod_Curso)
    REFERENCES CURSOS(Codigo)
);
    
INSERT INTO CURSOS (Codigo, Nombre, Max_Alumn, Fecha_Inic, Fecha_Fin, Num_Horas) VALUES 
(1, 'Curso 1', 30, STR_TO_DATE(REPLACE('01/01/2011','/','.') , GET_FORMAT(date,'EUR')),STR_TO_DATE(REPLACE('31/12/2001','/','.') , GET_FORMAT(date,'EUR')), 100);



INSERT INTO CURSOS (Codigo, Nombre, Max_Alumn, Fecha_Inic, Fecha_Fin, Num_Horas) VALUES 
(1, 'Curso 1', 30, STR_TO_DATE(REPLACE('01/01/2011','/','.'), GET_FORMAT(date,'EUR')), STR_TO_DATE(REPLACE('31/12/2011','/','.'), GET_FORMAT(date,'EUR')), 100);
INSERT INTO CURSOS (Codigo, Nombre, Max_Alumn, Fecha_Inic, Fecha_Fin, Num_Horas) VALUES 
(2, 'Curso 2', 30, STR_TO_DATE(REPLACE('01/01/2011','/','.'), GET_FORMAT(date,'EUR')), STR_TO_DATE(REPLACE('31/12/2011','/','.'), GET_FORMAT(date,'EUR')), 100);
INSERT INTO CURSOS (Codigo, Nombre, Max_Alumn, Fecha_Inic, Fecha_Fin, Num_Horas) VALUES 
(3, 'Curso 3', 30, STR_TO_DATE(REPLACE('01/01/2011','/','.'), GET_FORMAT(date,'EUR')), STR_TO_DATE(REPLACE('31/12/2011','/','.'), GET_FORMAT(date,'EUR')), 100);
INSERT INTO CURSOS (Codigo, Nombre, Max_Alumn, Fecha_Inic, Fecha_Fin, Num_Horas) VALUES 
(4, 'Curso 4', 30, STR_TO_DATE(REPLACE('01/01/2011','/','.'), GET_FORMAT(date,'EUR')), STR_TO_DATE(REPLACE('31/12/2011','/','.'), GET_FORMAT(date,'EUR')), 100);
INSERT INTO CURSOS (Codigo, Nombre, Max_Alumn, Fecha_Inic, Fecha_Fin, Num_Horas) VALUES 
(5, 'Curso 5', 30, STR_TO_DATE(REPLACE('01/01/2011','/','.'), GET_FORMAT(date,'EUR')), STR_TO_DATE(REPLACE('31/12/2011','/','.'), GET_FORMAT(date,'EUR')), 100);
INSERT INTO CURSOS (Codigo, Nombre, Max_Alumn, Fecha_Inic, Fecha_Fin, Num_Horas) VALUES 
(6, 'Curso 6', 30, STR_TO_DATE(REPLACE('01/01/2011','/','.'), GET_FORMAT(date,'EUR')), STR_TO_DATE(REPLACE('31/12/2011','/','.'), GET_FORMAT(date,'EUR')), 100);
   
    
    
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MANUELA','SUAREZ IBAÑEZ','M',STR_TO_DATE(REPLACE('30/6/1990','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MILAGROSA','DIAZ PEREZ','M',STR_TO_DATE(REPLACE('28/10/1984','/','.'), GET_FORMAT(date,'EUR')),3);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JOSE','CRESPO DE HERMOSO','H',STR_TO_DATE(REPLACE('2/3/1993','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ANTONIO JESUS','MARTIN BOLLO','H',STR_TO_DATE(REPLACE('4/11/1999','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'BARBARA','PELAEZ VALENCIA','M',STR_TO_DATE(REPLACE('27/8/1967','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JUAN PEDRO','GALVE GONZALEZ','H',STR_TO_DATE(REPLACE('10/11/1991','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MARIA ISABEL','PEREZ GUILLEN','M',STR_TO_DATE(REPLACE('14/11/1962','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'PATRICIA','ROMAN GOMEZ','M',STR_TO_DATE(REPLACE('26/4/1979','/','.'), GET_FORMAT(date,'EUR')),3);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'DAVID','TAPIA SOLANS','H',STR_TO_DATE(REPLACE('5/6/1980','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MARIA','FERREIRO SANTOS','M',STR_TO_DATE(REPLACE('29/1/1969','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JAVIER','LAMA DEL REY','H',STR_TO_DATE(REPLACE('26/2/1977','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ALEJANDRA','CALDERON VALDIVIA','M',STR_TO_DATE(REPLACE('16/11/1960','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ANA DOLORES','ESCUDERO ENCISO','M',STR_TO_DATE(REPLACE('7/9/1975','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JUAN CARLOS','RODRIGUEZ PADILLA','H',STR_TO_DATE(REPLACE('15/11/1963','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'CECILIO','SASTRE GONZALEZ','H',STR_TO_DATE(REPLACE('23/11/1969','/','.'), GET_FORMAT(date,'EUR')),3);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JUAN','MARTINEZ SANCHEZ','H',STR_TO_DATE(REPLACE('23/10/1974','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MARIA','LAFUENTE FERNANDEZ','M',STR_TO_DATE(REPLACE('21/11/1986','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MANUELA','MARTINEZ ALBA','M',STR_TO_DATE(REPLACE('26/11/1962','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ROSA NIEVES','SANCHEZ CANO','M',STR_TO_DATE(REPLACE('12/12/1979','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'BELEN','RAMOS ANGUITA','M',STR_TO_DATE(REPLACE('30/12/1967','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JULIAN','GARCIA ZABALA','H',STR_TO_DATE(REPLACE('4/1/1963','/','.'), GET_FORMAT(date,'EUR')),3);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'DIEGO JESUS','CANO SALVADOR','H',STR_TO_DATE(REPLACE('18/5/1970','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JOSE IGNACIO','HARO FANECA','H',STR_TO_DATE(REPLACE('8/5/1981','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JOSEFA','CASTELLANOS DIEZ','M',STR_TO_DATE(REPLACE('1/5/1998','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'BEATRIZ','RUBIO BERMEJO','M',STR_TO_DATE(REPLACE('29/4/1970','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JAVIER','CASTRO GOMEZ','H',STR_TO_DATE(REPLACE('20/8/1967','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'DAVID','GAY GARCIA DEL VALLE','H',STR_TO_DATE(REPLACE('22/7/1989','/','.'), GET_FORMAT(date,'EUR')),3);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'DAVID','TOCADOS GARCIA','H',STR_TO_DATE(REPLACE('18/1/1961','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ELISA ISABEL','BRUNO CALVO','M',STR_TO_DATE(REPLACE('13/5/1998','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'DIANA','GUILLAMON POSADA','M',STR_TO_DATE(REPLACE('29/4/1980','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'DAVID','RANILLA URRUTIA','H',STR_TO_DATE(REPLACE('22/11/1964','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JAVIER','LUENGO HERRERO','H',STR_TO_DATE(REPLACE('22/4/1963','/','.'), GET_FORMAT(date,'EUR')),3);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'DAVID','VALENCIA MEDINA','H',STR_TO_DATE(REPLACE('27/3/1981','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'RAFAEL','DIAZ LAMA','H',STR_TO_DATE(REPLACE('1/6/1979','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'CAROLINA','RIVAS MENDIA','M',STR_TO_DATE(REPLACE('30/7/1974','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JOSE MANUEL','GARCIA ZAPICO','H',STR_TO_DATE(REPLACE('3/3/1963','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MIGUEL','IBARROLA DIEZ','H',STR_TO_DATE(REPLACE('12/8/1985','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ENCARNACION','ASENJO HERNANDO','M',STR_TO_DATE(REPLACE('3/4/1962','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'FRANCISCO','CALVO BONO','H',STR_TO_DATE(REPLACE('17/6/1974','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JOSE ANTONIO','CALVO RODRIGUEZ','H',STR_TO_DATE(REPLACE('4/5/1989','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ANTONIA','MORENO RAYA','M',STR_TO_DATE(REPLACE('4/8/1976','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JOSE MARIA','FUENTEMILLA ALBERT','H',STR_TO_DATE(REPLACE('27/12/1979','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'BELEN','PORTERO GRACIA','M',STR_TO_DATE(REPLACE('28/10/1991','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'LUIS ANTONIO','SUAREZ GARCIA','H',STR_TO_DATE(REPLACE('24/10/1997','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'FRANCISCO ANTONIO','BAUTISTA LAMENCA','H',STR_TO_DATE(REPLACE('9/9/1992','/','.'), GET_FORMAT(date,'EUR')),3);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'SILVIA','PEÑA CASTAN','M',STR_TO_DATE(REPLACE('20/7/1977','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'CARMEN','KAAMOUCHI VICENTE','M',STR_TO_DATE(REPLACE('31/5/1990','/','.'), GET_FORMAT(date,'EUR')),3);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MARIA','LASTRA MOLINA','M',STR_TO_DATE(REPLACE('29/9/1961','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ROCIO EMILIA','IZQUIERDO BELTRAN','M',STR_TO_DATE(REPLACE('1/4/1981','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'OSCAR','DIEZ NAVARRO','H',STR_TO_DATE(REPLACE('17/6/1972','/','.'), GET_FORMAT(date,'EUR')),3);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JULIAN ANDRES','MORALES RIERA','H',STR_TO_DATE(REPLACE('31/12/1998','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MUJERES','ALCALA PEREZ','M',STR_TO_DATE(REPLACE('11/10/1970','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JOSE ANTONIO','GONZALEZ ROY','H',STR_TO_DATE(REPLACE('19/6/1965','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JOSEFA','GOMEZ EGIDO','M',STR_TO_DATE(REPLACE('27/9/1998','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MYRIAM','MORALES ISAC','M',STR_TO_DATE(REPLACE('15/9/1984','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'EDURNE','MARTINEZ LASTRA','M',STR_TO_DATE(REPLACE('25/1/1976','/','.'), GET_FORMAT(date,'EUR')),3);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JUAN JOSE','RIVAS RAMON','H',STR_TO_DATE(REPLACE('1/5/1994','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'DANIEL JOSE','BLANCO IZQUIERDO','H',STR_TO_DATE(REPLACE('5/2/1982','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MIRIAN','MONTERO LAMENCA','M',STR_TO_DATE(REPLACE('6/5/1972','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MARIA PAZ','BERTIZ SARMIENTO','M',STR_TO_DATE(REPLACE('1/4/1997','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'EMILIO','MORILLO RAMON','H',STR_TO_DATE(REPLACE('5/9/1986','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ENRIQUE','FERNANDEZ DIEZ','H',STR_TO_DATE(REPLACE('6/10/1972','/','.'), GET_FORMAT(date,'EUR')),3);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ANA TERESA','CASADO CRESPO','M',STR_TO_DATE(REPLACE('13/1/1971','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JOSE IGNACIO','MARTIN BERDUN','H',STR_TO_DATE(REPLACE('18/8/1987','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'DAVID','PADILLA ORTEGA','H',STR_TO_DATE(REPLACE('29/8/1960','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MIGUEL','GARCIA LARRETA','H',STR_TO_DATE(REPLACE('4/2/1982','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'LUIS MIGUEL','NAVARRO URRUTIA','H',STR_TO_DATE(REPLACE('20/4/1969','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'NURIA','AMOSTEGUI LUZURIAGA','M',STR_TO_DATE(REPLACE('25/10/1973','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ANA MARIA','SANDE LAMENCA','M',STR_TO_DATE(REPLACE('31/10/1999','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'LEON JOSE','SARMIENTO RIVAS','H',STR_TO_DATE(REPLACE('11/4/1969','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'VICTOR','GARCIA GARCÍA','H',STR_TO_DATE(REPLACE('29/12/1999','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'NATALIA','TIMON ECHEPARE','M',STR_TO_DATE(REPLACE('19/1/1986','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MELANIE','CAMPOY GOMEZ','M',STR_TO_DATE(REPLACE('24/2/1967','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'RAMIRO','LLOBREGAT ALONSO','H',STR_TO_DATE(REPLACE('14/5/1984','/','.'), GET_FORMAT(date,'EUR')),3);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JULIAN','JIMENO DIEZ','H',STR_TO_DATE(REPLACE('27/2/1976','/','.'), GET_FORMAT(date,'EUR')),3);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ISABEL','SORIANO MATAMOROS','M',STR_TO_DATE(REPLACE('7/7/1995','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MIGUEL','SANCHEZ SANCHEZ','H',STR_TO_DATE(REPLACE('6/2/1998','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'NOEMI','BERRUEZO REQUENA','M',STR_TO_DATE(REPLACE('25/11/1973','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'IVAN ANGEL DE LA','GARCIA RUBIO','H',STR_TO_DATE(REPLACE('26/3/1979','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'LUTGARDA','GOÑI TIMON','M',STR_TO_DATE(REPLACE('17/10/1974','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MARIA JESUS','RECOVER AGUILERA','M',STR_TO_DATE(REPLACE('20/3/1984','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MARIA SOLEDAD','MORILLAS GUILLEN','M',STR_TO_DATE(REPLACE('30/4/1975','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JUAN MANUEL','MARTIN ALEJANO','H',STR_TO_DATE(REPLACE('16/9/1980','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MARIA DEL MAR','CASTRO CRUZ','M',STR_TO_DATE(REPLACE('8/11/1977','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MARIA ISABEL','ECHAGUE GONZALEZ','M',STR_TO_DATE(REPLACE('30/3/1998','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'JUAN','TALEGON CORTES','H',STR_TO_DATE(REPLACE('12/7/1966','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'MIGUEL','ARAGUAS DE LA TORRE','H',STR_TO_DATE(REPLACE('12/8/1998','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'DAVID','ALONSO GIMENEZ','H',STR_TO_DATE(REPLACE('2/9/1995','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'NICOLAS','BLANCO GONZALEZ','H',STR_TO_DATE(REPLACE('8/3/1992','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ALBERTO','VEGA GARCIA','H',STR_TO_DATE(REPLACE('29/8/1976','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'EVA MARIA','FENOY ORDOÑEZ','M',STR_TO_DATE(REPLACE('4/12/1989','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ANA M.','GUERRERO LANZA','M',STR_TO_DATE(REPLACE('5/11/1963','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ANA MARIA','FERREIRO DIEZ','M',STR_TO_DATE(REPLACE('1/7/1999','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ARTURO','REVIRIEGO CERVANTES','H',STR_TO_DATE(REPLACE('2/8/1964','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'ALEJANDRO','CANO MORALES','H',STR_TO_DATE(REPLACE('13/5/1960','/','.'), GET_FORMAT(date,'EUR')),1);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'AZUCENA','BERENGUEL ROY','M',STR_TO_DATE(REPLACE('27/5/1998','/','.'), GET_FORMAT(date,'EUR')),4);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'PAZ DE','GARRALDA ARIAS','M',STR_TO_DATE(REPLACE('6/9/1972','/','.'), GET_FORMAT(date,'EUR')),3);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'PABLO CESAR','URBISTONDO GONZALEZ','H',STR_TO_DATE(REPLACE('12/2/1991','/','.'), GET_FORMAT(date,'EUR')),2);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'OSCAR','MARTIN GALINDO','H',STR_TO_DATE(REPLACE('3/8/1992','/','.'), GET_FORMAT(date,'EUR')),5);
INSERT INTO ALUMNADO (Codigo,Nombre,Apellidos,Sexo,Fecha_Nac,Cod_Curso) VALUES 
(null,'LUIS','MOLINA TAGARRO','H',STR_TO_DATE(REPLACE('16/1/1996','/','.'), GET_FORMAT(date,'EUR')),4);


INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('MARIA','GOMEZ ANDRES','M','4/5/1985');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('JOSE MANUEL','PADILLA VEGAS','H','19/5/1999');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('RICARDO','MARQUINA HERNANDO','H','20/2/1982');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('MIGUEL','DIAZ FABRE','H','17/4/1985');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('LUIS MIGUEL','AGURRUZA RODRIGUEZ','H','25/4/1983');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('NICOLAS','LOBATO BARRANCO','H','25/6/1961');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('MIGUEL','BURGOS ZAPICO','H','13/4/1986');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('JOSE JESUS','VALDIVIESO JIMENEZ','H','23/12/1985');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('ANA MARIA','BEAMONTE GOMEZ','M','25/7/1968');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('MARIA','LOPEZ CARREÑO','M','18/11/1963');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('MARIA DEL MAR','ASENSIO SEGURA','M','21/5/1984');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('ROSA NIEVES','LARRAÑETA LAZARO','M','10/6/1976');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('ELENA','DAZA FANECA','M','18/9/1960');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('GEMA','PASTOR ADELL','M','13/2/1983');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('MARIA CARMEN','CHECA CANO','M','11/8/1960');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('JOSE ANTONIO','GRACIA GONZALEZ','H','28/11/1962');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('AMALIA','GIL PER','M','10/1/1965');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('VICTOR','RAMON GARCIA','H','24/8/1991');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('ESPERANZA VICTORIA','PANIZO DEL AGUILA','M','7/12/1972');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('ANTONIO','ALONSO SORIANO','H','15/6/1985');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('JAVIER','BOTAZ HERNÁNDEZ','H','31/3/1999');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('FRANCISCO','CUTILLAS HERNANDEZ','H','30/3/1982');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('EDUARDO','LOPEZ RODRIGUEZ','H','20/11/1964');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('ADOLFO','LOPEZ EL AAKROUTI','H','16/10/1987');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('MARIA ROSA','MORA BAUTISTA','M','20/4/1969');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('GONZALO','IBAÑEZ PALENCIA','H','21/12/1965');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('ANA M.','DIEZ IZQUIERDO','M','7/10/1976');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('ALICIA MARIA','DIAZ GUERRERO','M','27/8/1968');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('MONTSERRAT','VELA SASTRE','M','29/1/1980');
INSERT INTO ALUMNADO_NUEVO (Nombre,Apellidos,Sexo,Fecha_Nac) VALUES 
('LUIS','BERMEJO GARCIA','H','7/11/1984');