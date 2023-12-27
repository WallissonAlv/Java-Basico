package contadorinteligente;

import java.util.Scanner;

public class ContadorInteligente {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String continuar;
        
        do{
            System.out.println("======================");
            System.out.println(" CONTADOR INTELIGENTE ");
            System.out.println("======================");

            System.out.print("Inicio da contagem: ");
            int inicio = teclado.nextInt();
            System.out.print("Fim da contagem: ");
            int fim = teclado.nextInt();

            System.out.println("=======================");
            System.out.println("    C O N T A N D O    ");
            System.out.println("=======================");

            if(inicio <= fim++){
                while(inicio < fim){
                    System.out.println(inicio+"...");
                    inicio++;
                }
            }else if (inicio >= fim--){
                while(inicio >= fim){
                    System.out.println(inicio+"...");
                    inicio--;
                }
            }
            System.out.print("Deseja realizar outra operacao? (S/N): ");
            continuar = teclado.next();
        }while(continuar.equals("S"));
        System.out.println("Obrigado por utilizar meu programa!");
    }
}
