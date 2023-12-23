package calculadorabasica;

public class Adicao {
    
    private int resp = 0;
            
    int soma (int num1, int num2){
        int resultado = num1 + num2;
        resp = resultado;
        return 0;
    }
    public int getResultado(){
        return resp;
    }
    
}
