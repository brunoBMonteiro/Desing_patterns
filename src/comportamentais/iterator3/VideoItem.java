package comportamentais.iterator3;

public class VideoItem {
    String nome;
    double preco;

    VideoItem(String nome, double d){
        this.nome = nome;
        this.preco = d;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}