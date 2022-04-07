package comportamentais.iterator3;

public class VideoIterator implements Iterator{

    VideoItem[] itens;
    int posicao = 0;

    public VideoIterator(VideoItem[] itens) {
        this.itens = itens;
    }

    public Object next() {
        VideoItem videoItem = itens[posicao];
        posicao++;
        return videoItem;
    }

    public boolean hasNext() {
        if (posicao >= itens.length || itens[posicao] == null) {
            return false;
        } else {
            return true;
        }
    }
}