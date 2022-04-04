package estruturais.decoratorexemple2;

public class Main {
    public static void imprimirInfo(Cafe c) {
        System.out.println("Preço: " + c.informarPreco() + ", Ingredientes: " + c.informarIngredientes());
    }

    public static void main(String[] args) {
        Cafe c = new CafeSimples();
        imprimirInfo(c);

        c = new ComLeite(c);
        imprimirInfo(c);

        c = new CafeSimples();
        c = new ComSorvete(c);
        imprimirInfo(c);
    }

}
