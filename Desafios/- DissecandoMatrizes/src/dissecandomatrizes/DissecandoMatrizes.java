package dissecandomatrizes;

import java.util.Scanner;

public class DissecandoMatrizes {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int[][] matriz = new int [5][5];
        int linha,coluna,esc;
        String resp = "S";
        
        System.out.println("======================");
        System.out.println("   CRIANDO MATRIZES   ");
        System.out.println("======================");
        
        // PRENCHER OS VALORES DA MATRIZ
        for(linha = 1 ; linha<matriz.length ; linha++){
            for(coluna=1 ; coluna<matriz.length ; coluna++){
                System.out.print("DIGITE O VALOR NA POSICAO {"+linha+","+coluna+"}: ");
                matriz [linha][coluna] = teclado.nextInt();
            }
        }
        
        // ESCOLHER OPÇÕES
        do {
            System.out.println(" MENU DE OPCOES ");
            System.out.println("========================");
            System.out.println("[1] MOSTRAR MATRIZ");
            System.out.println("[2] DIAGONAL PRINCIPAL");
            System.out.println("[3] TRIANGULO SUPERIOR");
            System.out.println("[4] TRIANGULO INFERIOR");
            System.out.println("[5] SAIR");
            System.out.print  ("================= OPCAO: ");
            esc = teclado.nextInt();
            
            switch(esc){
                case 1 -> {
                    for(linha = 1 ; linha<5 ; linha++){
                        for(coluna = 1 ; coluna<5 ; coluna++){
                            System.out.print("   "+matriz[linha][coluna]);
                        }
                        System.out.println("");
                    }
                }    
                case 2 -> {   
                    for(linha = 1 ; linha<5 ; linha++){
                        for(coluna = 1 ; coluna<5 ; coluna++){
                            if(linha == coluna){
                                System.out.print("   "+matriz[linha][coluna]);
                            }else{
                                System.out.print("   ");
                            }
                        }System.out.println("");
                    }
                }  
                case 3 -> {
                    for(linha = 1 ; linha<5 ; linha++){
                        for(coluna = 1 ; coluna<5 ; coluna++){
                            if(linha < coluna){
                                System.out.print(matriz[linha][coluna]+"   ");
                            }else{
                                System.out.print("    ");
                            }
                        }System.out.println("");
                    }
                }
                case 4 -> {
                    for(linha = 1 ; linha<5 ; linha++){
                        for(coluna = 1 ; coluna<5 ; coluna++){
                            if(linha > coluna){
                                System.out.print("   "+matriz[linha][coluna]);
                            }else{
                                System.out.print("   ");
                            }
                        }System.out.println("");
                    }
                }
                case 5 -> {
                    resp = "Nao";
                }
            }
        }while(resp.equals("Nao"));
        System.out.println(" S A I N D O ");
    }
    
    
    
}
