package posicaonoalfabeto;

import java.util.Scanner;

public class PosicaoNoAlfabeto {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        String a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
        
        a = "A";
        b = "B";
        c = "C";
        d = "D";
        e = "E";
        f = "F";
        g = "G";
        h = "H";
        i = "I";
        j = "J";
        k = "K";
        l = "L";
        m = "M";
        n = "N";
        o = "O";
        p = "P";
        q = "Q";
        r = "R";
        s = "S";
        t = "T";
        u = "U";
        v = "V";
        w = "W";
        x = "X";
        y = "Y";
        z = "Z";
        
        System.out.print("Digite uma letra MAIUSCULA para saber sua posicao no alfabeto: ");
        String letra = teclado.next();
        
        // DECIDIR VOGAL OU CONSOANTE
        
        if ((letra.equals("A"))||(letra.equals("E"))||
            (letra.equals("I"))||(letra.equals("O"))||
            (letra.equals("U"))){
            System.out.println("ESTA LETRA E UMA VOGAL");
        } else if ((letra.equals("B"))||(letra.equals("C"))||
            (letra.equals("D"))||(letra.equals("F"))||
            (letra.equals("G"))||(letra.equals("H"))||
            (letra.equals("J"))||(letra.equals("K"))||
            (letra.equals("L"))||(letra.equals("M"))||
            (letra.equals("N"))||(letra.equals("P"))||
            (letra.equals("Q"))||(letra.equals("R"))||
            (letra.equals("S"))||(letra.equals("T"))||
            (letra.equals("V"))||(letra.equals("W"))||
            (letra.equals("X"))||(letra.equals("Y"))||
            (letra.equals("Z"))){
            System.out.println("ESTA LETRA E UMA CONSOANTE");
        }
        
        // DECIDIR A POSICAO DA LETRA
        
        if(letra.equals("A")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 1");
        }else if(letra.equals("B")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 2");
        }else if(letra.equals("C")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 3");
        }else if(letra.equals("D")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 4");
        }else if(letra.equals("E")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 5");
        }else if(letra.equals("F")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 6");
        }else if(letra.equals("G")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 7");
        }else if(letra.equals("H")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 8");
        }else if(letra.equals("I")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 9");
        }else if(letra.equals("J")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 10");
        }else if(letra.equals("K")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 11");
        }else if(letra.equals("L")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 12");
        }else if(letra.equals("M")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 13");
        }else if(letra.equals("N")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 14");
        }else if(letra.equals("O")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 15");
        }else if(letra.equals("P")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 16");
        }else if(letra.equals("Q")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 17");
        }else if(letra.equals("R")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 18");
        }else if(letra.equals("S")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 19");
        }else if(letra.equals("T")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 20");
        }else if(letra.equals("U")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 21");
        }else if(letra.equals("V")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 22");
        }else if(letra.equals("W")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 23");
        }else if(letra.equals("X")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 24");
        }else if(letra.equals("Y")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 25");
        }else if(letra.equals("Z")){
            System.out.println("A LETRA "+ letra +" ESTA NA POSICAO 26");
        }
    }
    
}
