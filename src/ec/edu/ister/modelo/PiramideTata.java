/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class PiramideTata {

    public static void seriElementos() {
        int piso = Integer.parseInt(JOptionPane.showInputDialog("ingrese el "
                + "numero de pisos"));
        int acu = 0;
        for (int i = piso; i >= 1; i--) {
            acu = i + acu;
            piso--;

        }

        final int k = 16;
        //int d = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de elementos"));
        int p[] = new int[acu];
        int m[] = new int[acu];
        for (int i = 0; i < m.length; i++) {
             if (i == 0) {
                    m[i] = 6;
                    p[i] = m[i] + k;
                } else {
                    p[i] = p[i - 1] + k;
                    m[i] = p[i - 1] + m[i - 1];
                }
            }
        System.out.println(Arrays.toString(m));
        int numeroActual;
        String resp="";
        for (int i = 1; i < piso; i++) {
             for (int j = 1; j < i; j++) {
                numeroActual = m[i];
                resp = numeroActual + resp + " ";
                  JOptionPane.showMessageDialog(null, m[i]);
            }
            resp = resp+"\n";
        }
        JOptionPane.showMessageDialog(null, resp);
    }

    public static void piramide() {

        int numero = 6; //Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero de la escalera"));
        int filasMaxima = 5; //Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de filas"));
        int numeroActual = numero - 1;
        String respuesta = "";
        for (int i = 1; i <= filasMaxima; i++) {
            for (int j = 1; j <= i; j++) {
                numeroActual = numeroActual + 1;
                respuesta = respuesta + numeroActual + " ";
            }
            respuesta = respuesta + "\n";
        }
        JOptionPane.showMessageDialog(null, respuesta);

    }

    public static int pisos() {
        int piso = Integer.parseInt(JOptionPane.showInputDialog("ingrese el "
                + "numero de pisos"));
        int acu = 0;
        for (int i = piso; i >= 1; i--) {
            acu = i + acu;
            piso--;

        }
        return acu;

    }

}

