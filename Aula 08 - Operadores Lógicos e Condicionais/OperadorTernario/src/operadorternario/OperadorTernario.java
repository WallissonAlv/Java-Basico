/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author pdv.ocf
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        n1 = 14;
        n2 = 28;
        
        // SE ()? ENTAO : SENAO
        r = (n1>n2)?n1+n2:n1-n2;
        // SE N1 FOR MAIOR QUE N2, ENTÃO N1 + N2 SENAO N1 - N2
        System.out.println(r);
    }
    
}
