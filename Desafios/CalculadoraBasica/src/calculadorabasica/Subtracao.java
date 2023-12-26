package calculadorabasica;

public class Subtracao {
    private double resp = 0;
    
    double subt (double num1, double num2){
        double resultado = num1 - num2;
        resp = resultado;
        return 0;
    };
    public double getResultado(){
        return resp;
    };
}
