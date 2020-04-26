package examples.Ej30_12_Metodos_para_manipulacion_de_caracteres_de_StringBuilder;

public class StringBuilderChars {
    public static void main(String[] args) {
        StringBuilder bufer = new StringBuilder("Hola a todos");

        System.out.printf("bufer = %s\n", bufer.toString());
        System.out.printf("Caracter en 0: %s\nCaracter en 3: %s\n\n", bufer.charAt(0), bufer.charAt(3));

        char[] arregloChars = new char[bufer.length()];
        bufer.getChars(0, bufer.length(), arregloChars, 0);
        System.out.print("Los caracteres son: ");

        for (char character : arregloChars)
            System.out.print(character);

        bufer.setCharAt(0, 'H');
        bufer.setCharAt(7, 'T');
        System.out.printf("\n\nbufer = %s", bufer.toString());

        bufer.reverse();
        System.out.printf("\n\nbufer = %s\n", bufer.toString());
    }
}
