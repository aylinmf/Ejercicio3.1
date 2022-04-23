package com.example.ejercicio31.Configuracion;

public class bdemple {

    public static final String NameDatabase = "Database";
    public static final String tablaEmple = "Empleados";

    public static final String id= "id";
    public static final String nombre="nombre";
    public static final String apellidos="apellidos";
    public static final String edad="edad";
    public static final String puesto="puesto";
    public static final String direccion="direccion";


    //Creacion de la tabla
    public static final String CREATE_TABLE_Emple = "CREATE TABLE " + tablaEmple +
            "(id INTEGER PRIMARY KEY AUTOINCREMENT,"+
            "nombre TEXT, apellidos TEXT, edad INTEGER, direccion TEXT, puesto TEXT)";



    public static final String DROP_TABLE_Emple ="DROP TABLE IF EXISTS Empleados";
    public static final String SELECT_ALL_TABLE_Emple = "SELECT * FROM " + tablaEmple;

}
