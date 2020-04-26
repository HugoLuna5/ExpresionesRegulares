package exercises.Exercise1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    /**
     (Latín cerdo) Escriba una aplicación que codifi que frases en español a frases en latín cerdo. El latín cerdo es una
     forma de lenguaje codifi cado. Existen muchas variaciones en los métodos utilizados para formar frases en latín cerdo.
     Por cuestiones de simpleza, utilice el siguiente algoritmo:
     */

    private static char word[];
    private static String[] words;
    private static String[] translated;
    private static int count = 0;
    private static int totalLetters;
    private static String string;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Escriba un enunciado y oprima enter");
            String enunciado = scanner.nextLine();
            translateWordToLatin(enunciado);
        } catch (Exception e) {
            System.out.println(" Ocurrio un error al capturar el texto");
        }
    }

    public static void translateWordToLatin(String enunciado) {
        StringTokenizer tokens = new StringTokenizer(enunciado);
        int data = tokens.countTokens();
        words = new String[data];
        translated = new String[data];

        while (tokens.hasMoreElements()) {
            words[count] = tokens.nextToken();
            count++;
        }

        for (int i = 0; i < data; i++) {
            string = words[i];

            word = string.toCharArray();
            totalLetters = string.length() - 1;

            String s4 = new String(word, 1, totalLetters);
            String s5 = s4 + word[0] + "ae";
            translated[i] = s5;
        }

        System.out.println();
        System.out.println("Traducción al latin cerdo: ");
        for (int j = 0; j < data; j++) {
            System.out.print(translated[j] + " ");
        }
        System.out.println();
    }

}
