/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginb;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
/**
 *
 * @author alex
 */

public class Curso {

    public int idCurso;
    public String nombreCurso;
    public String seccionCurso;
    public Date fechaFinCurso;
    public Date fechaInicioCurso;
    public String horaInicioCurso;
    public String horaFinCurso;
    public String profesorSeleccionado;
    
    public ArrayList<Alumno> alumnos = new ArrayList<>();
   
    
    public Curso(int idCurso, String nombreCurso, String seccionCurso, Date fechaInicioCurso, Date fechaFinCurso, String horaInicioCurso, String horaFinCurso, String profesorSeleccionado) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.seccionCurso = seccionCurso;
        this.fechaInicioCurso = fechaInicioCurso;
        this.fechaFinCurso = fechaFinCurso;
        this.horaInicioCurso = horaInicioCurso;
        this.horaFinCurso = horaFinCurso;
        this.profesorSeleccionado = profesorSeleccionado;
    
    }

    
    
  public int getidCurso() {
        return idCurso;
    }

    public String getnombreCurso() {
        return nombreCurso;
    }

    public String getSeccionCurso() {
        return seccionCurso;
    }



    public String getHoraInicioCurso() {
        return horaInicioCurso;
    }

    public String getHoraFinCurso() {
        return horaFinCurso;
    }

    public String getProfesorSeleccionado() {
        return profesorSeleccionado;
    }

    
     public String getFechaInicioCurso() {
        SimpleDateFormat formatoEspañol = new SimpleDateFormat("dd/MM/yyyy", new Locale("es", "ES"));
        return formatoEspañol.format(fechaInicioCurso);
    }

    public String getFechaFinCurso() {
        SimpleDateFormat formatoEspañol = new SimpleDateFormat("dd/MM/yyyy", new Locale("es", "ES"));
        return formatoEspañol.format(fechaFinCurso);
    }
    
    public ArrayList<Alumno> getAlumnos() {
    return this.alumnos;
}
    private int notaFinal;

    // Constructor y otros métodos existentes...

    // Método para establecer la nota final del curso
    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    // Método para obtener la nota final del curso
    public int getNotaFinal() {
        return notaFinal;
    }
    
    @Override
    public String toString() {
        return getnombreCurso() + " " + getSeccionCurso()+" "+ getProfesorSeleccionado();

    }
    
}
