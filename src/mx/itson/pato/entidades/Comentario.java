/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pato.entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Jesus
 */
public class Comentario {
    
    private Date fecha;
    private String contenido;
    private Usuario autor;
    private List<Comentario> comentario;

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * @return the autor
     */
    public Usuario getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    /**
     * @return the comentario
     */
    public List<Comentario> getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(List<Comentario> comentario) {
        this.comentario = comentario;
    }
}
