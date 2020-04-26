package examples.Ej30_11_Metodos_length_y_capacity_de_StringBuilder;

public class StringBuilderCapLen {
    public static void main(String[] args) {

        StringBuilder bufer = new StringBuilder("Hola, como estas?");

        System.out.printf("bufer = %s\nlongitud = %d\ncapacidad = %d\n\n",
                bufer.toString(), bufer.length(), bufer.capacity());
        bufer.ensureCapacity(75);
        System.out.printf("Nueva capacidad = %d\n\n", bufer.capacity());
        bufer.setLength(10);
        System.out.printf("Nueva longitud = %d\nbufer = %s\n",
                bufer.length(), bufer.toString());
    }
}
