package com.example.ejercicio31.Configuracion;

public class empleado {

    private Integer id;
    String Nombre;
    String Apellidos;
    String Dire;
    String Puesto;
    String Edad;

    public empleado(String Nombre, String Apellidos, String Dire, String Puesto, String Edad, Integer id) {
        Nombre = Nombre;
        Apellidos = Apellidos;
        Dire = Dire;
        Puesto = Puesto;
        Edad = Edad;
        this.id = id;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getDireccion() {
        return Dire;
    }

    public void setDireccion(String direccion) {
        Dire = direccion;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String puesto) {
        Puesto = puesto;
    }

    public String getEdad() {
        return Edad;

    }

    public void setEdad(String edad) {
        Edad = edad;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
