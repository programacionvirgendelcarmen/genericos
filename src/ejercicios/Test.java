package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> enteros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            enteros.add(random.nextInt());
        }
        List<Double> reales = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            reales.add(random.nextDouble());
        }
        ArrayGenericos<Integer> arrayEnteros =
                new ArrayGenericos<>(enteros);
        ArrayGenericos<Double> arrayReales =
                new ArrayGenericos<>(reales);
        System.out.printf("ENTEROS, valor máximo %.0f y valor medio %.2f%n",
                arrayEnteros.obtenerValorMaximo(), arrayEnteros.calcularValorMedio());
        System.out.printf("REALES, valor máximo %.2f y valor medio %.2f%n",
                arrayReales.obtenerValorMaximo(), arrayReales.calcularValorMedio());

        System.out.printf("ENTEROS, valor mínimo %.0f%n", ArrayGenericos.calcularValorMinimo(enteros));
        System.out.printf("REALES, valor mínimo %.2f%n", ArrayGenericos.calcularValorMinimo(reales));

    }
}
