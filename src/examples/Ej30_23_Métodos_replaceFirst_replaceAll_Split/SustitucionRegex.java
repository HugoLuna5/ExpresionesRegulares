package examples.Ej30_23_Métodos_replaceFirst_replaceAll_Split;

public class SustitucionRegex {

    public static void main(String[] args) {
        String primeraCadena = "Este enunciado termina con 5 estrellas *****";
        String segundaCadena = "1, 2, 3, 4, 5, 6, 7, 8";

        System.out.printf("Cadena 1 original: %s\n", primeraCadena);
        // sustituye '*' con '^'
        primeraCadena = primeraCadena.replaceAll("\\*", "^");

        System.out.printf("^ sustituyen a *: %s\n", primeraCadena);
        // sustituye 'estrellas' con 'ntercaladores'
        primeraCadena = primeraCadena.replaceAll("estrellas", "intercaladores");

        System.out.printf(
                "\"intercaladores\" sustituye a \"estrellas\": %s\n", primeraCadena);

        // sustituye las palabras con 'palabra'
        System.out.printf("Cada palabra se sustituye por \"palabra\": %s\n\n",
                primeraCadena.replaceAll("\\w+", "palabra"));

        System.out.printf("Cadena 2 original: %s\n", segundaCadena);
        // sustituye los primeros tres dígitos con 'digito'
        for (int i = 0; i < 3; i++) {
            segundaCadena = segundaCadena.replaceFirst("\\d", "digito");
        }

        System.out.printf(
                "Los primeros 3 digitos se sustituyeron por \"digito\" : %s\n", segundaCadena);

        String salida = "Cadena dividida en comas: [";

        String[] resultados = segundaCadena.split(",\\s*"); // se divide en las comas 39
        for (String cadena : resultados) {
            salida += "\"" + cadena + "\", "; // imprime resultados
        }
        // elimina la coma adiconal y agrega un corchete
        salida = salida.substring(0, salida.length() - 2) + "]";
        System.out.println(salida);
    }
}
