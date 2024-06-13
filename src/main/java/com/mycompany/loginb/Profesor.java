/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginb;

import static com.mycompany.loginb.Loginb.cursos;
import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Profesor {
    public String nombre;
    public String apellido;
    public String usuario;
    public String password;

 public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }
     
    public ArrayList<Curso> getCursos() {
    return cursos;
}

    
}
