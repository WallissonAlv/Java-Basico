package calculadorabasica;

public class Divisao {
    private double resp = 0;
    
    double Divi(double num1, double num2){
        double resultado = num1 / num2;
        resp = resultado;
        return 0;
    }
    public double getDivisao(){
        return resp;
    }
}
