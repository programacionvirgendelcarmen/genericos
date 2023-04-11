package teoria;

public class Generico1 {
    private Object referencia;

    public Generico1(Object referencia) {
        this.referencia = referencia;
    }

    public Object getReferencia() {
        return referencia;
    }

    public void setReferencia(Object referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Generico1{");
        sb.append("referencia=").append(referencia);
        sb.append('}');
        return sb.toString();
    }
}
