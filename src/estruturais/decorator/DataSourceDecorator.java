package estruturais.decorator;

/*
    ========================Base Decorator===============================
    A classe Decorador Base tem um campo para referenciar um objeto envolvido.
    O tipo do campo deve ser declarado assim como a interface do componente para
    que possa conter ambos os componentes concretos e os decoradores. O decorador base
    delega todas as operações para o objeto envolvido.
 */

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
