/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefuncao01;

/**
 *
 * @author pdv.ocf
 */
public class TesteFuncao01 {
    
    /*static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma e "+ s);
    }
    public static void main(String[] args) {
        
        System.out.println("Comecou o programa");
        soma(5,2);
    }*/
    
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        
        System.out.println("Comecou o programa");
        int sm = soma(5,2);
        System.out.println("A soma vale "+ sm);
    }
    
}
