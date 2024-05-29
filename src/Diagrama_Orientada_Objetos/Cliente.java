package Diagrama_Orientada_Objetos;

import java.util.*;

class Cliente {
    private String DNI;
    private String nombre;
    private String direccion;
    private String telefono;
    private String codigo;
    private Cliente avaladoPor;

    public Cliente(String DNI, String nombre, String direccion, String telefono, String codigo, Cliente avaladoPor) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigo = codigo;
        this.avaladoPor = avaladoPor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", codigo='" + codigo + '\'' +
                ", avaladoPor=" + avaladoPor +
                '}';
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getAvaladoPor() {
        return avaladoPor;
    }

    public void setAvaladoPor(Cliente avaladoPor) {
        this.avaladoPor = avaladoPor;
    }
}
