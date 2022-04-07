package estruturais.adapterexemplo3;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Reproduzindo arquivo mp4. Nome: "+ fileName);
    }
}