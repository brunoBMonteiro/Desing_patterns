package comportamentais.state;

public class OrderedState implements PackageState{
    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("O pacote está em seu estado raiz.");
    }

    @Override
    public void printStatus() {
        System.out.println("Pacote encomendado, ainda não entregue no escritório.");
    }
}
