package examples.Ej30_14_Metodos_insert_y_delete_de_StringBuilder;

public class StringBuilderInsert {
    public static void main(String[] args) {

        Object refObjeto = "hola";
        String cadena = "adios";
        char[] arregloChars = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean valorBoolean = true;
        char valorChar = 'K';
        int valorInt = 7;
        long valorLong = 10000000;
        float valorFloat = 2.5f; // el sufijo f indica que 2.5 es un float
        double valorDouble = 33.333;

        StringBuilder bufer = new StringBuilder();

        bufer.insert(0, refObjeto);
        bufer.insert(0, " "); // cada uno de estos contiene nueva línea
        bufer.insert(0, cadena);
        bufer.insert(0, " ");
        bufer.insert(0, arregloChars);
        bufer.insert(0, " ");
        bufer.insert(0, arregloChars, 3, 3);
        bufer.insert(0, " ");
        bufer.insert(0, valorBoolean);
        bufer.insert(0, " ");
        bufer.insert(0, valorChar);
        bufer.insert(0, " ");
        bufer.insert(0, valorInt);
        bufer.insert(0, " ");
        bufer.insert(0, valorLong);
        bufer.insert(0, " ");
        bufer.insert(0, valorFloat);
        bufer.insert(0, " ");
        bufer.insert(0, valorDouble);

        System.out.printf("bufer despues de insertar:\n%s\n\n", bufer.toString());

        bufer.deleteCharAt(10); // elimina el 5 en 2.5
        bufer.delete(2, 6); // elimina el .333 en 33.333

        System.out.printf("bufer despues de eliminar:\n%s\n", bufer.toString());
    }
}
