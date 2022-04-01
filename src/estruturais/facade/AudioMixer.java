package estruturais.facade;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("AudioMixer: corrigindo o áudio...");
        return new File("tmp");
    }
}
