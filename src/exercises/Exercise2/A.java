package exercises.Exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

    /**
     * (Análisis de texts) La disponibilidad de computadoras con capacidades de manipulación de cadenas ha dado
     * como resultado algunos métodos interesantes para analizar los escritos de grandes autores. Se ha dado mucha importancia para saber si realmente vivió William Shakespeare. Algunos estudiosos creen que existe una gran evidencia que
     * indica que en realidad fue Cristopher Marlowe quien escribió las obras maestras que se atribuyen a Shakespeare. Los
     * investigadores han utilizado computadoras para buscar similitudes en los escritos de estos dos autores. En este ejercicio
     * se examinan tres métodos para analizar texts mediante una computadora.
     * a) Escriba una aplicación que lea una línea de texto desde el teclado e imprima una tabla que indique el número de ocurrencias de cada letra del alfabeto en el text. Por ejemplo, la frase:
     * Ser o no ser: ese es el dilema:
     * contiene una “a”, ninguna “b”, ninguna “c”, etcétera.
     */



    public static void main(String[] args) throws IOException {

        String ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingresa un texto:");
        ch=br.readLine();
        int count,len;

        System.out.println("+-----------------+-----------------+");
        System.out.println("+----Caracter-----+----Utilizada-----+");
        System.out.println("+-----------------+------------------+");


            try
            {
                char[] name =ch.toCharArray();
                char[] alphabet ="abcdefghijklmnopqrstuvwxyz".toCharArray();
                len=name.length;


                for (char c : alphabet) {
                    count = 0;
                    //Counts the number of times a character repeats in the string
                    for (int j = 0; j < len; j++) {
                        if ((c == name[j]))
                            count++;
                    }

                    System.out.println("+-        " + c + "      -+- " + count + " ocasion(es) -+");


                    ch = ch.replace("" + name[0], "");
                }



            }
            catch(Exception ex){
                //System.err.println("Ocurrio un error: "+ex.getMessage());
            }






        System.out.println("+---------------+--------------------+");
    }




}
