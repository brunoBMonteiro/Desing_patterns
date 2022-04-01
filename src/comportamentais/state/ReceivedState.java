package comportamentais.state;

public class ReceivedState implements PackageState{

    @Override
    public void next(Package pkg) {
        System.out.println("Este pacote já foi recebido por um cliente.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {

    }


}
