package estruturais.decorator;

/*
    ============================================Component==========================
    O Componente declara a interface comum tanto para os envoltórios como para os objetos envolvidos.
 */

public interface DataSource {
    void writeData(String data);

    String readData();
}
