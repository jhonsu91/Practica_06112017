
package ec.edu.ister.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author JHON SUNTAXI
 */
public class FormacionPrimoSuma {
    
    public static boolean esPrimo(int numero){
       //int cont =2;
        boolean resp=true;
        for (int i = 2; i < numero; i++) {
            if(numero%i==0){
                resp=false;
            }                      
        }
        return resp;
    }

    public static void todosPrimos(){
        int tope=Integer.parseInt(JOptionPane.showInputDialog("ingrese el tope"));
        ArrayList<Integer> acu = new ArrayList<>();
        for (int i = 2; i < tope; i++) {
            if (esPrimo(i)==true) {
               acu.add(i);
               
            }           
        }
        
        JOptionPane.showMessageDialog(null, Arrays.toString(acu.toArray()));
    }
    public static void menu(){
        String opciones ="1.- Es primo\n"
                + "2.- salir";
        int op =Integer.parseInt(JOptionPane.showInputDialog(opciones));
        switch(op){
            case 1:
                JOptionPane.showMessageDialog(null,"¿es primo: ?"+esPrimo(Integer.parseInt(
                        JOptionPane.showInputDialog("ingrese numero"))));
                break;
            case 2:
                todosPrimos();
                break;
        }
    }
}