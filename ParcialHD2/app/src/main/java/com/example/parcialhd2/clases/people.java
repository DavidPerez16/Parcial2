package com.example.parcialhd2.clases;


import java.io.Serializable;

public class people implements Serializable {
    String imagen;
    String name;
    String status;
    String type;

    public people(String imagen, String name, String status, String type) {
        this.imagen = imagen;
        this.name = name;
        this.status = status;
        this.type = type;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
