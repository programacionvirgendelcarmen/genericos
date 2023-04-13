package ejercicios;

import java.util.List;

public class ArrayGenericos <T extends Number>{
    private List<T> lista;

    public ArrayGenericos(List<T> lista) {
        this.lista = lista;
    }
    public int obtenerNumeroValores() {
        return lista.size();
    }
    public double obtenerValorMaximo() {
        if (lista.isEmpty())
            return Double.MIN_VALUE;
        double valorMaximo = lista.get(0).doubleValue();
        for (int i = 1 ; i < lista.size(); i++) {
            if (lista.get(i).doubleValue() > valorMaximo)
                valorMaximo = lista.get(i).doubleValue();
        }
        return valorMaximo;
    }
    public double calcularValorMedio() {
        double suma = 0;
        for (Number number : lista) {
            suma += number.doubleValue();
        }
        return suma / obtenerNumeroValores();
    }

    public static double calcularValorMinimo(List<? extends Number> list) {
        double valorMinimo = Double.MAX_VALUE;
        for (Number number: list) {
            if (number.doubleValue() < valorMinimo)
                valorMinimo = number.doubleValue();
        }
        return valorMinimo;
    }
}
