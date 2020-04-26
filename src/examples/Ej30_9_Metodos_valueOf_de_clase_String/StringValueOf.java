package examples.Ej30_9_Metodos_valueOf_de_clase_String;


public class StringValueOf {

    public static void main(String[] args) {
        char[] arregloChar = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean valorBoolean = true;
        char valorCaracter = 'Z';
        int valorEntero = 7;
        long valorLong = 10000000000L; // el sufijo L indica long
        float valorFloat = 2.5f; // f indica que 2.5 es un float
        double valorDouble = 33.333; // no hay sufijo, double es el predeterminado
        Object refObjeto = "Hola"; // asigna la cadena a una referencia Object

        System.out.printf("arreglo de valores char = %s\n", String.valueOf(arregloChar));
        System.out.printf("parte del arreglo char = %s\n", String.valueOf(arregloChar, 3, 3));
        System.out.printf("boolean = %s\n", String.valueOf(valorBoolean));
        System.out.printf("char = %s\n", String.valueOf(valorCaracter));
        System.out.printf("int = %s\n", String.valueOf(valorEntero));
        System.out.printf("long = %s\n", String.valueOf(valorLong));
        System.out.printf("float = " + String.valueOf(valorFloat) + "\n");
        System.out.printf("double = %s\n", String.valueOf(valorDouble));
        System.out.printf("Object = %s\n", String.valueOf(refObjeto));
    }
}
