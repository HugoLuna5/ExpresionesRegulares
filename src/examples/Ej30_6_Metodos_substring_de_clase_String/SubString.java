package examples.Ej30_6_Metodos_substring_de_clase_String;

public class SubString {

    public static void main(String[] args) {
        String letras = "ggnjknjkskmahjjjjhjheeñsdmdsyhvvbdreqwasdcscx";
        // prueba los métodos substring
        System.out.printf("La subcadena desde el índice 20 hasta el final es \"%s\"\n",
                letras.substring(20));
        System.out.printf("%s \"%s\"\n",
                "La subcadena desde el índice 3 hasta, pero sin incluir al 6 es",
                letras.substring(3, 6));
    }
}
