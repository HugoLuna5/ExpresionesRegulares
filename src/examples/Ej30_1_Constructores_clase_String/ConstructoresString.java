package examples.Ej30_1_Constructores_clase_String;


public class ConstructoresString {
    public static void main(String[] args) {
        char[] arregloChar = {'c', 'u', 'm', 'p', 'l', 'e', ' ', 'a', 'n', 'i', 'o', 's'};
        String s = new String("hola");

        // usa los constructores de String
        String s1 = "";
        String s2 = new String(s);
        String s3 = new String(arregloChar);
        String s4 = new String(arregloChar, 7, 5);

        // mostrar las cadenas
        System.out.printf("s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n", s1, s2, s3, s4);
    }
}
