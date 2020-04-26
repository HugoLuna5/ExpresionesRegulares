package exercises.Exercise3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    /**
     (Impresión de fechas en varios formatos) Las fechas se imprimen en varios formatos comunes. Dos de los formatos
     más utilizados son:
     04/25/1955 y Abril 25, 1955
     */

    public static void formatDate(String oldDate) {
        SimpleDateFormat parseador = new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat formateador = new SimpleDateFormat("MM-yyyy-dd");
        Date date = null;
        try {
            date = parseador.parse(oldDate);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        formateador.format(date);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la fecha y oprima la tecla Intro");
        String strfecha = scanner.nextLine();
        formatDate(strfecha);


    }


}
