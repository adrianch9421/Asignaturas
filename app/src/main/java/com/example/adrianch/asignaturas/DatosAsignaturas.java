package com.example.adrianch.asignaturas;

/**
 * Created by rompe on 03/11/2017.
 */

public class DatosAsignaturas {
	int imagenAsignatura, creditosAsignatura, imagenDocente;
	String nombreAsignatura, docenteAsignatura;

	public void DatosAsignaturas(){
		imagenAsignatura = R.drawable.bases;
		nombreAsignatura = "Fundamentos de Bases de Datos";
		creditosAsignatura = 5;
		docenteAsignatura = "Alguien";
		imagenDocente = R.drawable.profe2;
	}

	public DatosAsignaturas(int imagen, String nombre, int creditos, String docente, int imgDocente) {
		imagenAsignatura = imagen;
		nombreAsignatura = nombre;
		creditosAsignatura = creditos;
		docenteAsignatura = docente;
		imagenDocente = imgDocente;
	}
}
