package clases;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class Asignatura {

    //Aqui inicializamos las variables que utilizaremos en la clase asignatura
    private int notas[];
    private int cantpers;
    private String nombres[];

    //Aqui introducimos los nombres
    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    //Aqui obtenemos los nombres
    public String[] getNombres() {
        return this.nombres;
    }

    //Aqui introducimos las notas
    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    //Aqui obtenemos las notas
    public int[] getNotas() {
        return this.notas;
    }

    
    //Aqui introducimos la cantidad de personas
    public void setCantidadPersonas(int cantidad) {
        this.cantpers = cantidad;
    }
    //Aqui obtenemos la cantidad de persona
    public int getCantidadPersonas() {
        return this.cantpers;
    }

    //Aqui verificamos la cantidad de alumnos que hicieron 100 puntos
    public int calm100puntos() {
        int m, cantalum100puntos = 0;
        for (m = 0; m < cantpers; m++) {
            if (notas[m] == 100) {
                cantalum100puntos += 1;
            }
        }
        return cantalum100puntos;
    }

    //Aqui ordenamos todos los datos
    public void ordenar() {
        double n;
        int s;
        String tempnombre;
        int tempnotas;
        // Ordenar
        tempnotas = 0;
        tempnombre = "";
        for (n = 2; n <= cantpers; n++) {
            for (s = 1; s <= cantpers - 1; s++) {
                if (nombres[s - 1].compareTo(nombres[s]) > 0) {
                    tempnombre = nombres[s - 1];
                    nombres[s - 1] = nombres[s];
                    nombres[s] = tempnombre;
                    tempnotas = notas[s - 1];
                    notas[s - 1] = notas[s];
                    notas[s] = tempnotas;
                }
            }
        }
    }

    //Aqui imprimimos la lista de forma ordenada
    public void listaordenada() {
        System.out.println("Lista ordenada por Nombre: ");
        System.out.println("Nº    Nombre    Notas");
        System.out.println("---------------------");
        for (int l = 0; l < cantpers; l++) {
            System.out.print(l);
            System.out.print("   ");
            System.out.print(nombres[l]);
            System.out.print("    ");
            System.out.println(notas[l]);
        }
    }

    //Calculamos el promedio de sus notas y verificamos de forma cualitativa
    public void promedionotas() {
        int p;
        double promedial = 0;
        for (p = 1; p <= cantpers; p++) {
            promedial = promedial + notas[p - 1] / cantpers;
        }
        System.out.println("El promedio es: " + promedial);
        if (promedial > 90) {
            System.out.println("el promedio de notas del grupo es bueno");
        }
        if (promedial > 69 && promedial < 89) {
            System.out.println("el promedio del grupo es regular");
        }
        if (promedial < 60) {
            System.out.println("El promedio del grupo es malo");
        }
    }

}
