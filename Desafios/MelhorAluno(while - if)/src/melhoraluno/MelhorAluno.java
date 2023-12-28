package melhoraluno;

import java.util.Scanner;

public class MelhorAluno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String a1, melhor = null;
        int qtde, cont = 1;
        double n1, nota = 0;
        
        System.out.println("=====================");
        System.out.println("   ESCOLA BOA NOTA   ");
        System.out.println("=====================");
        
        System.out.print ("Quantidade de alunos na escola: ");
        qtde = teclado.nextInt();
        System.out.println("===============================");

        while(cont <= qtde){
            System.out.print("Digite o nome do aluno "+cont+": ");
            a1 = teclado.next();
            System.out.print("Digite a nota do aluno "+cont+": ");
            n1 = teclado.nextDouble();
            System.out.println("===============================");

            if(n1 > nota){
                nota = n1;
                melhor = a1; 
            }
        cont++;    
        }
        System.out.println("O MELHOR APROVEITAMENTO FOI DO ALUNO "
        +melhor+" COM A NOTA "+nota);
    }
}
