package examples.Ej30_10_Constructores_clase_StringBuilder;


public class ConstructoresStringBuilder {

    public static void main(String[] args) {
        StringBuilder bufer1 = new StringBuilder();
        StringBuilder bufer2 = new StringBuilder(10);
        StringBuilder bufer3 = new StringBuilder("hola");

        System.out.printf("bufer1 = \"%s\"\n", bufer1.toString());
        System.out.printf("bufer2 = \"%s\"\n", bufer2.toString());
        System.out.printf("bufer3 = \"%s\"\n", bufer3.toString());
    }
}
