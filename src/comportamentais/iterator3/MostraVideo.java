package comportamentais.iterator3;

public class MostraVideo {

    public static void main(String[] args) {
        VideoItem [] videoItens = new VideoItem[4];

        videoItens[0] = new VideoItem("Homem-Aranha De Volta Ao Lar", 2.5);
        videoItens[1] = new VideoItem("Casa Do Lago", 1.5);
        videoItens[2] = new VideoItem("Agente 007", 1.5);
        videoItens[3] = new VideoItem("Anjos da Lei", 2.0);

        Iterator videoIterator = new VideoIterator(videoItens);

        while (videoIterator.hasNext()) {
            VideoItem videoItem = (VideoItem)videoIterator.next();
            System.out.println(videoItem.nome+" = R$ "+videoItem.preco);
        }
    }

}
