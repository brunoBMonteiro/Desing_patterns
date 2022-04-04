package estruturais.decoratorexemple2;

public abstract class CafeDecorator implements Cafe{
    private final Cafe cafeDecorador;

    public CafeDecorator(Cafe cafe) {
        this.cafeDecorador = cafe;
    }

    @Override
    public double informarPreco() {
        return cafeDecorador.informarPreco();
    }

    @Override
    public String informarIngredientes() {
        return cafeDecorador.informarIngredientes();
    }

    public Cafe getCafe() {
        return cafeDecorador;
    }
}