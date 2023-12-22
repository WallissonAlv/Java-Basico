package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        
        /*int n1 = 3;                // OPERAÇÃO ARITMETICA (ADIÇÃO, SUBTRAÇÃO...)
        int n2 = 5;
        float n =(n1 + n2)/2;
        System.out.println("A media e igual a "+ n);*/
        
        /*int numero = 10;           // OPERAÇÃO UNÁRIA (INCREMENTO E DECREMENTO)
        int valor = 4 + numero ++;
        System.out.println(valor);
        System.out.println(numero);*/
        
        /* int x = 4;                //OPERAÇÃO DE ATRIBUIÇÃO
        x += 2; //x = x + 2
        System.out.println(x); */
        
        /* float v = 8.3f;           // NUMEROS ALEATORIOS
        int ar = (int) Math.round(v);
        System.out.println(ar); */
        
        double ale = Math.random();  // NUMEROS ALEATORIOS
        int n = (int) (20 + ale * (50-20));
        System.out.println(n);
        
        
    }
    
}
