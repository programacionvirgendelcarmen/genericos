package teoria;

public class Test {
    public static void main(String[] args) {
        Generico1 generico1 = new Generico1("hola");
        generico1.setReferencia("hello");
        String cadena1 = (String) generico1.getReferencia();
        System.out.println(cadena1);

        Generico1 generico12 = new Generico1(8);
        generico12.setReferencia(18);
        int entero1 = (int) generico12.getReferencia();
        System.out.println(entero1);

        Generico2<String> generico2 = new Generico2<>("hello");
        generico2.setReferencia("hola");
        String cadena2 = generico2.getReferencia();
        System.out.println(cadena2);

        Generico2<Float> generico22 = new Generico2<>(2.2f);
        generico22.setReferencia(1.1f);
        float numero = generico22.getReferencia();
        System.out.println(numero);

        GenericaDoble<String, Double> genericaDoble =
                new GenericaDoble<>("cadena", 2.3);
        genericaDoble.setValorT("string");
        genericaDoble.setValorV(2e3);
        System.out.println(genericaDoble);

        GenericaDoble<String, String> genericaDoble1 =
                new GenericaDoble<>("11111111H", "jacinto meléndez brenez");
        genericaDoble1.setValorT("11111111Z");
        genericaDoble1.setValorV("luisa garcía garcía");
        System.out.println(genericaDoble1);

    }
}
