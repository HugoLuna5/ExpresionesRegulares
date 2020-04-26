package exercises.Exercise2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B {

    /**
     (Análisis de textos) La disponibilidad de computadoras con capacidades de manipulación de cadenas ha dado
     como resultado algunos métodos interesantes para analizar los escritos de grandes autores. Se ha dado mucha importancia para saber si realmente vivió William Shakespeare. Algunos estudiosos creen que existe una gran evidencia que
     indica que en realidad fue Cristopher Marlowe quien escribió las obras maestras que se atribuyen a Shakespeare. Los
     investigadores han utilizado computadoras para buscar similitudes en los escritos de estos dos autores. En este ejercicio
     se examinan tres métodos para analizar texts mediante una computadora.
     b) Escriba una aplicación que lea una línea de text e imprima una tabla que indique el número de palabras
     de una letra, de dos letras, de tres letras, etcétera, que aparezcan en el text. Por ejemplo, en la figura 30.25
     se muestra la cuenta para la frase:
     ¿Que es mas noble para el espiritu?
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        int max = 0;
        do {
            System.out.println("Introduce texto: ");
            text = sc.nextLine().toLowerCase();

        } while (text.isEmpty());

        StringTokenizer tokensWords = new StringTokenizer(text);
        int nDatos = tokensWords.countTokens();
        String[] words = new String[nDatos];
        int[] dataRepeat = new int[nDatos];
        int contador = 0;

        while (tokensWords.hasMoreElements()) {
            words[contador] = tokensWords.nextToken();

            dataRepeat[contador] = words[contador].replaceAll("[^A-Za-z\\s]", "").length();
            contador++;
        }

        for (int value : dataRepeat) {
            if (max < value) {
                max = value;
            }
        }

        Arrays.sort(dataRepeat);
        System.out.println("+------------------------+-------------------+");
        System.out.println("+---Longitud de palabra--+-----Apariciones---+");
        System.out.println("+------------------------+-------------------+");
        for (int a = 1; a <= max; a++) {
            int cantidad = 0;
            for (int value : dataRepeat) {
                if (a == value) {
                    cantidad++;
                }
            }

            System.out.println("+-           " + a + "          -+-        " + cantidad + "        -+");
        }
        System.out.println("+------------------------+-------------------+");

    }

}
