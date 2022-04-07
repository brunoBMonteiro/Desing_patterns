package estruturais.adapterexemplo3;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Reproduzindo arquivo vlc. Nome: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}