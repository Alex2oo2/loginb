/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginb;

/**
 *
 * @author alex
 */
public class Alumno {

    public String genero;
    public String nombre;
    public String apellido;
    public String carne;
    public String password;
    public double nota;
    public double promedio;

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getNota() {
        return nota;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double nota) {
        this.promedio = promedio;
    }
    
   @Override
    public String toString() {
        return getNombre() + " " + getApellido()+" "+ getCarne();

    } 
    
}