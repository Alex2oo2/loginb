/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginb;
import java.util.ArrayList;


/**
 *
 * @author alex
 */
public class Loginb {
    
    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static Profesor profesorLogeado = new Profesor();
    public static Alumno alumnoLogeado = new Alumno();
    public static ArrayList<Curso> cursos = new ArrayList<>();   
    
    public static void main(String[] args) {
       Login l= new Login();
       l.setVisible(true);
    }

   public static ArrayList<Profesor> obtenerProfesores() {
        return profesores;
    }
    
}
