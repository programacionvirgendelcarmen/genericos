package teoria;

public class GenericaDoble <T, V>{
    private T valorT;
    private V valorV;

    public GenericaDoble(T valorT, V valorV) {
        this.valorT = valorT;
        this.valorV = valorV;
    }

    public T getValorT() {
        return valorT;
    }

    public void setValorT(T valorT) {
        this.valorT = valorT;
    }

    public V getValorV() {
        return valorV;
    }

    public void setValorV(V valorV) {
        this.valorV = valorV;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GenericaDoble{");
        sb.append("valorT=").append(valorT);
        sb.append(", valorV=").append(valorV);
        sb.append('}');
        return sb.toString();
    }
}
