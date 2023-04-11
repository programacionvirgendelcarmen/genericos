package teoria;

public class Generico2 <T>{
    private T referencia;

    public Generico2(T referencia) {
        this.referencia = referencia;
    }

    public T getReferencia() {
        return referencia;
    }

    public void setReferencia(T referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Generico2{");
        sb.append("referencia=").append(referencia);
        sb.append('}');
        return sb.toString();
    }
}
