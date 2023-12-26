package calculadorabasica;

import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args){
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Adicao adi = new Adicao();
        Subtracao sub = new Subtracao();
        Multiplicacao mul = new Multiplicacao();
        Divisao div = new Divisao();
        String continuar;
        
        do {
            System.out.println("=====================");
            System.out.println(" CALCULADORA BASICA ");
            System.out.println("=====================");
            System.out.println(" [ 1 ] ADICAO         ");
            System.out.println(" [ 2 ] SUBTRACAO      ");
            System.out.println(" [ 3 ] MULTIPLICACAO  ");
            System.out.println(" [ 4 ] DIVISAO        ");
            System.out.println("=====================");
            System.out.print("Escola uma opcao: ");
            int Opc = teclado.nextInt(); // Ler opção que usuário digitar na Tela

            switch(Opc){
                case 1 -> {
                    System.out.print("Digite o primeiro valor: ");
                    double Esc1 = teclado.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    double Esc2 = teclado.nextDouble();
                    adi.soma(Esc1, Esc2);
                    System.out.println("=====================");
                    System.out.println("     RESULTADO     ");
                    System.out.println("=====================");
                    System.out.println(Esc1+ " + " +Esc2+ " = " +adi.getResultado());
                    // deve retornar o procedimento de Soma
                    break;
                }
                case 2 -> {
                    System.out.print("Digite o primeiro valor: ");
                    double Esc1 = teclado.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    double Esc2 = teclado.nextDouble();
                    sub.subt(Esc1, Esc2);
                    System.out.println("=====================");
                    System.out.println("     RESULTADO     ");
                    System.out.println("=====================");
                    System.out.println(Esc1+ " - " +Esc2+ " = " +sub.getResultado());
                    // deve retornar o procedimento de Subtração
                    break;
                }
                case 3 -> {
                    System.out.print("Digite o primeiro valor: ");
                    double Esc1 = teclado.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    double Esc2 = teclado.nextDouble();
                    mul.Mult(Esc1, Esc2);
                    System.out.println("=====================");
                    System.out.println("     RESULTADO     ");
                    System.out.println("=====================");
                    System.out.println(Esc1+ " X " +Esc2+ " = " +mul.getMultiplicacao());
                    // deve retornar o procedimento de Multiplicação
                    break;
                }
                case 4 -> {
                    System.out.print("Digite o primeiro valor: ");
                    double Esc1 = teclado.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    double Esc2 = teclado.nextDouble();
                    div.Divi(Esc1, Esc2);
                    System.out.println("=====================");
                    System.out.println("     RESULTADO     ");
                    System.out.println("=====================");
                    System.out.println(Esc1+ " / " +Esc2+ " = " +div.getDivisao());
                    // deve retornar o procedimento de Divisão
                    break;
                }
                default ->{
                    System.out.println("Escolha uma opcao valida!");
                }
            }
            System.out.print("Deseja realizar outra operacao? (S/N): ");
            continuar = teclado.next();
        } while (continuar.equals("S"));
        System.out.println("Obrigado por utilizar meu programa :D");
    }    
}
