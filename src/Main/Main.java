package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main (String[] arg) throws ParseException {
        int a = 100;
        String sa = String.valueOf(a);
        System.out.println(sa);

        Integer ia = Integer.valueOf(a);
        String s_i_a = ia.toString();
        System.out.println(s_i_a);
        String value = "12.124";
        float i_value = Float.valueOf(value).floatValue();
        System.out.println(i_value);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date today = sdf.parse("22/11/2012");
        System.out.println(today.toString());
    }
}   
