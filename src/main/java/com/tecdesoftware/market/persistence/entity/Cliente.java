package com.tecdesoftware.market.persistence.entity;
import jakarta.persistence.*;
import com.tecdesoftware.market.persistence.entity.Compras;

import java.util.List;


@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    //no se pone @GeneratedValue(strategy = GenerationType.IDENTITY) por la CURP
    private String id;

    private String nombre;

    private String apellidos;

    //Long corresponde a un número más grande
    private Long celular;

    private String direccion;

    @Column (name = "correo_electronico")
    private String correoElectronico;

    private String contrasena;

    @OneToMany(mappedBy = "cliente")
    private List<Compras> compras;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}