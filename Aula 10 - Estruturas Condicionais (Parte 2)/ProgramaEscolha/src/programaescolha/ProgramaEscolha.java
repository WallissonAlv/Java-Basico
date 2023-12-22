/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaescolha;

import java.util.Scanner;

/**
 *
 * @author pdv.ocf
 */
public class ProgramaEscolha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Quantas Pernas");
        int perna = teclado.nextInt();
        String tipo;
        System.out.println("Isso e um(a): ");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripe";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            default:
                tipo = "ET";
                break;        
        }
        System.out.println(tipo);    
    }
    
}
