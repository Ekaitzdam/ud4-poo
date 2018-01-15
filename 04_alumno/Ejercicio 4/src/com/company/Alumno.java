package com.company;

public class Alumno {

    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;


    public Alumno(String nombre, String apellidos, String dni, String telefono) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;


    }

    public void visualizar() {
        System.out.print(nombre + " | ");
        System.out.print(apellidos + " | ");
        System.out.print(dni + " | ");
        System.out.print(telefono);
        System.out.print("\n");

    }

}
