
package calculadorabasica;

import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args){
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Adicao adi = new Adicao();
        
        System.out.println("=====================");
        System.out.println(" CALCULADORA BASICA ");
        System.out.println("=====================");
       
        System.out.println(" [ 1 ] ADICAO         ");
        System.out.println(" [ 2 ] SUBTRACAO      ");
        System.out.println(" [ 3 ] MULTIPLICACAO  ");
        System.out.println(" [ 4 ] DIVISAO        ");
        int Opc = teclado.nextInt(); // Ler opção que usuário digitar na Tela
        
        switch(Opc){
            case 1 -> {
                System.out.print("Digite o primeiro valor: ");
                int Esc1 = teclado.nextInt();
                System.out.print("Digite o segundo valor: ");
                int Esc2 = teclado.nextInt();
                adi.soma(Esc1, Esc2);
                System.out.print("A soma desses valores é: ");
                System.out.println(adi.getResultado());
                // deve retornar o procedimento de soma
                break;
            }
            case 2 -> {
                
            }
        }
    }
}
