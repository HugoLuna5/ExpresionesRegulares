package examples.Ej30_13_Metodos_append_de_clase_StringBuilder;

public class StringBuilderAppend {
    public static void main(String[] args) {
        Object refObjeto = "hola";
        String cadena = "adios";
        char[] arregloChar = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean valorBoolean = true;
        char valorChar = 'Z';
        int valorInt = 7;
        long valorLong = 10000000000L;
        float valorFloat = 2.5f; // el sufijo f indica que 2.5 es un float
        double valorDouble = 33.333;

        StringBuilder ultimoBufer = new StringBuilder("ultimo bufer");
        StringBuilder bufer = new StringBuilder();

        bufer.append(refObjeto);
        bufer.append("\n"); // cada uno de estos contiene nueva línea
        bufer.append(cadena);
        bufer.append("\n");
        bufer.append(arregloChar);
        bufer.append("\n");
        bufer.append(arregloChar, 0, 3);
        bufer.append("\n");
        bufer.append(valorBoolean);
        bufer.append("\n");
        bufer.append(valorChar);
        bufer.append("\n");
        bufer.append(valorInt);
        bufer.append("\n");
        bufer.append(valorLong);
        bufer.append("\n");
        bufer.append(valorFloat);
        bufer.append("\n");
        bufer.append(valorDouble);
        bufer.append("\n");
        bufer.append(ultimoBufer);

        System.out.printf("bufer contiene %s\n", bufer.toString());
    }
}
