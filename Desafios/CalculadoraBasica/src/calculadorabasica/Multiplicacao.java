package calculadorabasica;

public class Multiplicacao {
    private double resp = 0;
    
    double Mult(double num1, double num2){
        double resultado = num1 * num2;
        resp = resultado;
        return 0;
    }
    public double getMultiplicacao(){
        return resp;
    }
}
