
package relogioidiomaresolucao;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;


public class RelogioIdiomaResolucao {

    public static void main(String[] args) {
        Date Relogio = new Date();
        System.out.print("A Data e a Hora de hoje e: ");
        System.out.println(Relogio); //Imprime Portugues
        Locale loc = Locale.getDefault();
        System.out.print("O sistema esta usando o idioma: ");
        System.out.println(loc.getDisplayLanguage());
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolucao da tela esta em: " +d.width +"x" +d.height);
    }
    
}
