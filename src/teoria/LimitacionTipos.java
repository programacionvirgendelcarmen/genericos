package teoria;

import java.util.ArrayList;
import java.util.List;

public class LimitacionTipos {
    private static <E> void imprimirDatos1(List<E> lista) {
        for (E elemento: lista) {
            System.out.println(elemento);
        }
        System.out.println("====================");
    }
    private static void imprimirDatos2(List<?> lista) {
        for (Object elemento: lista) {
            System.out.println(elemento);
        }
        System.out.println("////////////////////");
    }
    private static double multiplicarElementos(List<? extends Number> lista) {
        double multiplicacion = 1.0;
        for (Number number : lista) {
            multiplicacion *= number.doubleValue();
        }
        return multiplicacion;
    }

    public static void main(String[] args) {
        List<Integer> enteros = List.of(1, 2, 3, 4);
        List<Float> reales = List.of(1.1f, 2.2f, 3f, 4.6f);
        List<String> cadenas = List.of("uno", "dos", "tres");
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("juan", 21));
        personas.add(new Persona("felipe", 56));
        personas.add(new Persona("esmeralda", 12));
        imprimirDatos1(enteros);
        imprimirDatos1(reales);
        imprimirDatos1(cadenas);
        imprimirDatos1(personas);
        imprimirDatos2(enteros);
        imprimirDatos2(reales);
        imprimirDatos2(cadenas);
        imprimirDatos2(personas);
        System.out.println("????????????????????");
        System.out.printf("La multiplicación de los enteros vale %.2f%n",
                  multiplicarElementos(enteros));
        System.out.printf("La multiplicación de los reales vale %.2f%n",
                 multiplicarElementos(reales));
       // multiplicarElementos(cadenas); no posible, String no extend de Number
    }
}
class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }
}
