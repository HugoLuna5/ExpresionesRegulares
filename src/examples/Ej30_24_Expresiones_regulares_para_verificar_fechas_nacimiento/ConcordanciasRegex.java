package examples.Ej30_24_Expresiones_regulares_para_verificar_fechas_nacimiento;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConcordanciasRegex {
    public static void main(String[] args) {
        // crea la expresión regular
        Pattern expresion =
                Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
        String cadena1 = "Jane nacio el 05-12-75\n" +
                "Dave nacio el 11-04-68\n" +
                "John nacio el 04-28-73\n" +
                "Joe nacio el 12-17-77";
        // compara la expresión regular con la cadena e imprime las concordancias
        Matcher matcher = expresion.matcher(cadena1);
        while (matcher.find())
            System.out.println(matcher.group());
    }
}
