package estruturais.observer.editor;

import estruturais.observer.publisher.EventManager;

import java.io.File;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("Aberto", "salvar");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("aberto", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("salvar", file);
        } else {
            throw new Exception("Por favor abra o arquivo primeiro.");
        }
    }
}