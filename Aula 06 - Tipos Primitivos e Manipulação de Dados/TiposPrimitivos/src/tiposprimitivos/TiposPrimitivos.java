/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author pdv.ocf
 */
public class TiposPrimitivos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nome = "Gustavo";
        float Nota = 8.5f;
        System.out.print("A sua nota é " + Nota); //Esta linha não vai quebrar
        System.out.println("A sua nota é " + Nota); //Esta vai pular linha no final
        System.out.printf("A sua nota é %.2f \n", Nota); //Para quebrar linha adicionamos \n
        System.out.printf("A nota de %s e %.2f \n", Nome, Nota);
        System.out.format("A nota de %s e %.2f \n", Nome, Nota);
        
        Scanner teclado = new Scanner(System.in); // Entrada de Dados, aqui a maquina irá monitorar o que o usuario digitar...
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.printf("A nota do %s é %.2f", nome, nota);
        
        
    }
    
}
