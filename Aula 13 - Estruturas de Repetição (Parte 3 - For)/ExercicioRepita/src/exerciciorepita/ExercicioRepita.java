/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

   
    public static void main(String[] args) {
        
        int n, soma = 0, acimacem = 0,pares = -1,impares = 0, valores = -1;
        float media;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número: <br><em>(Valor 0 Interrompe!)</em></html>"));
            valores += 1;            // SOMA DE QUANTIDADES DE VALORES
            
            if (n % 2 == 0){         // TESTE PARA VERIFICAR NUMERO PAR
            pares += 1;
            } else if (n % 2 == 1){  // TESTE PARA VERIFICAR NUMERO IMPAR
                impares += 1;
            } 
            if (n > 100){            // TESTE PARA VERIFICAR NUMERO MAIOR QUE CEM
                acimacem += 1;
            }
            soma += n;
        } while (n != 0);
        media = soma/valores;
        
        JOptionPane.showMessageDialog(null,"<html> Resultado <hr>" +
                "<br>Total de valores: "+valores+"<br>Soma Total: "+soma+"<br>Total de pares: "+pares+
                "<br>Total de impares: "+impares+"<br>Acima de Cem: "+acimacem+
                "<br>Media dos valores: "+media);
        }
}
