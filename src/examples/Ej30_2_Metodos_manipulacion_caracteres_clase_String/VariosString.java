package examples.Ej30_2_Metodos_manipulacion_caracteres_clase_String;


public class VariosString {

    public static void main(String[] args) {
        String s1 = "Hola a todos";
        char[] arregloChar = new char[5];
        System.out.printf("s1: %s", s1);

        // prueba el método length
        System.out.printf("\nLongitud de s1: %d", s1.length());

        // itera a través de los caracteres en s1 con charAt y muestra la cadena invertida
        System.out.print("\nLa cadena invertida es: ");

        for (int cuenta = s1.length() - 1; cuenta >= 0; cuenta--) {
            System.out.printf("%s ", s1.charAt(cuenta));
        }
        // copia los caracteres de la cadena a arregloChar
        s1.getChars(0, 4, arregloChar, 0);
        System.out.print("\nEl arreglo de caracteres es: ");

        for (char caracter : arregloChar) {
            System.out.print(caracter);
        }

        System.out.println();
    }
}
