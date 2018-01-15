package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombre, apellidos, telefono, dni;

        Alumno[] alumnos = new Alumno[5];


        for (int i = 0; i < 5; i++) {


            System.out.println("Escribe el nombre: ");
            nombre = br.readLine();
            System.out.println("Escribe el apellido: ");
            apellidos = br.readLine();
            System.out.println("Escribe el dni: ");
            dni = br.readLine();
            System.out.println("Escribe el telefono: ");
            telefono = br.readLine();
            alumnos[i] = new Alumno(nombre, apellidos, dni, telefono);
        }

        for (int i = 0; i < 5; i++) {
            alumnos[i].visualizar();
        }


    }
}
