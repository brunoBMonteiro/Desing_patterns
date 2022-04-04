package estruturais.decoratorexemple2;

public class ComSorvete extends CafeDecorator {
    public ComSorvete(Cafe cafe) {
        super(cafe);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double informarPreco() {
        return super.informarPreco() + 3.0;
    }

    @Override
    public String informarIngredientes() {
        return super.informarIngredientes() + ", Sorvete de Creme";
    }
}
