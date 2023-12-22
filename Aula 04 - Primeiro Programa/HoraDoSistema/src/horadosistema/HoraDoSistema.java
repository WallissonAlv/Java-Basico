
package horadosistema;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HoraDoSistema {
    public static void main(String[] args) {
    Date relogio = new Date();
    System.out.println("A Hora do Sistema e:");
    System.out.println(relogio.toString());
    
    Calendar cal = GregorianCalendar.getInstance();
    System.out.println(cal.get(Calendar.YEAR));
    }
}
