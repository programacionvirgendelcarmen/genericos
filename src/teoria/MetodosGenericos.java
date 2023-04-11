package teoria;

import java.util.List;

public class MetodosGenericos {

    private static <E> void imprimirLista (List<E> lista) {
        for (E e: lista) {
            System.out.println(e);
        }
        System.out.println("__________________");
    }

    public static void main(String[] args) {
        List<String> listaCadenas = List.of("uno", "dos", "tres", "cuatro");
        List<Integer> listaEnteros = List.of(1, 2, 3, 4, 5, 6);
        imprimirLista(listaEnteros);
        imprimirLista(listaCadenas);
    }

}
