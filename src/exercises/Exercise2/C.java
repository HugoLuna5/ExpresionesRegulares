package exercises.Exercise2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C {

    /**
     * (Análisis de textos) La disponibilidad de computadoras con capacidades de manipulación de cadenas ha dado
     * como resultado algunos métodos interesantes para analizar los escritos de grandes autores. Se ha dado mucha importancia para saber si realmente vivió William Shakespeare. Algunos estudiosos creen que existe una gran evidencia que
     * indica que en realidad fue Cristopher Marlowe quien escribió las obras maestras que se atribuyen a Shakespeare. Los
     * investigadores han utilizado computadoras para buscar similitudes en los escritos de estos dos autores. En este ejercicio
     * se examinan tres métodos para analizar textos mediante una computadora.
     * c) Escriba una aplicación que lea una línea de texto e imprima una tabla que indique el número de ocurrencias
     * de cada palabra distinta en el texto. La primera versión de su programa debe incluir las palabras en la tabla,
     * en el mismo orden en el cual aparecen en el texto. Por ejemplo, las líneas:
     * Ser o no ser: ese es el dilema: ¿Que es mas noble para el espiritu?
     */


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String texto;
        int numeroDeVeces = 0;
        do {
            System.out.println("Introduce texto: ");
            texto = sc.nextLine().toLowerCase();

        } while (texto.isEmpty());
        StringTokenizer tokens = new StringTokenizer(texto.replaceAll("[^A-Za-z\\s]", ""));

        ArrayList<String> allWords = new ArrayList<>();
        ArrayList<String> removed = new ArrayList<>();

        String s = texto.replaceAll("[^A-Za-z\\s]", "");
        String[] arr = s.split(" ");

        allWords.addAll(Arrays.asList(arr));


        while (tokens.hasMoreElements()) {
            removed.add(tokens.nextToken());
        }


        /**
         * Delete repeat data
         */
        for (int i = 0; i < removed.size(); i++) {

            for (int j = 0; j < removed.size() - 1; j++) {

                if (i != j) {

                    if (removed.get(i).equalsIgnoreCase(removed.get(j))) {
                        removed.remove(j);
                    }
                }


            }

        }



        System.out.println("+------------------------+-------------------+");
        System.out.println("+---------Palabra--------+------Utilizada----+");
        System.out.println("+------------------------+-------------------+");
        for (int k = 0; k < removed.size(); k++) {

                numeroDeVeces = contarCaracteres(allWords, removed.get(k).replaceAll("\\s+",""));
                System.out.println("+-           " + removed.get(k)+ "                  " + numeroDeVeces + "        ");

        }
        System.out.println("+------------------------+-------------------+");










    }

    /**
     *
     * @param words all the words in the text
     * @param character separate character to evaluate
     * @return number of the times og repeat
     */
    public static int contarCaracteres(ArrayList<String> words, String character) {
        int countAux = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(character)) {
                countAux++;
            }
        }

        return countAux;
    }


}
