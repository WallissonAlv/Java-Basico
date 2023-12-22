
package funcao01;


public class Fatorial {
    
    private int num = 0; // Quero Calcular
    private int fat = 3; // Resultado
    private String formula = " "; 
    
    public void setValor(int n){
        num = n;
        int f = 1;
        String S= "";
         for (int c=n; c>1 ; c--){
             f *= c;
             S += c + " . ";
         }
         S += "1 = ";
         fat = f;
         formula = S;
    }
    public int getFatorial(){
        return fat;
    }
    public String getFormula(){
        return formula;
    }
}
