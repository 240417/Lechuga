/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pato.entidades;

import java.util.Date;

/**
 *
 * @author Alejandra Medina
 */
public class Usuario {
    
    private String nombre;
    private String correoElrctronico;
    private String apodo;
    private Date fechaNacimiento;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the correoElrctronico
     */
    public String getCorreoElrctronico() {
        return correoElrctronico;
    }

    /**
     * @param correoElrctronico the correoElrctronico to set
     */
    public void setCorreoElrctronico(String correoElrctronico) {
        this.correoElrctronico = correoElrctronico;
    }

    /**
     * @return the apodo
     */
    public String getApodo() {
        return apodo;
    }

    /**
     * @param apodo the apodo to set
     */
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
}
