package clases;

import javax.swing.*;
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
        String salida = "";
        salida = salida.concat("Lista ordenada por Nombre: \n");
        salida = salida.concat("Nº    Nombre    Notas\n");
        salida = salida.concat("---------------------\n");
        for (int l = 0; l < cantpers; l++) {
            salida = salida.concat(String.valueOf(l));
            salida = salida.concat("   ");
            salida = salida.concat(nombres[l]);
            salida = salida.concat("    ");
            salida = salida.concat(notas[l]+"\n");
        }
        JOptionPane.showMessageDialog(null,salida);
    }

    //Calculamos el promedio de sus notas y verificamos de forma cualitativa
    public void promedionotas() {
        int p;
        double promedial = 0;
        for (p = 1; p <= cantpers; p++) {
            promedial = promedial + notas[p - 1] / cantpers;
        }
        JOptionPane.showMessageDialog(null,"El promedio es: " + promedial);
        if (promedial > 90) {
            JOptionPane.showMessageDialog(null,"el promedio de notas del grupo es bueno");
        }
        if (promedial > 69 && promedial < 89) {
            JOptionPane.showMessageDialog(null,"el promedio del grupo es regular");
        }
        if (promedial < 60) {
            JOptionPane.showMessageDialog(null,"El promedio del grupo es malo");
        }
    }

}
