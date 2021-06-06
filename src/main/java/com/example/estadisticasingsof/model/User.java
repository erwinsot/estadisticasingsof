package com.example.estadisticasingsof.model;

import org.springframework.data.annotation.Id;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class User {
    @Id
    private long id;
    private String nombre;
    private String apellido;
    private Map materia;
    private long tiempo;
    private String correo;
    private List prueba;

    public List getPrueba() {
        return prueba;
    }

    public void setPrueba(List prueba) {
        this.prueba = prueba;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Map getMateria() {
        return materia;
    }

    public void setMateria(Map materia) {
        this.materia = materia;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public User(long id, String nombre, String apellido, Map materia, long tiempo, String correo, List prueba) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.tiempo = tiempo;
        this.correo = correo;
        this.prueba = prueba;
    }


}
