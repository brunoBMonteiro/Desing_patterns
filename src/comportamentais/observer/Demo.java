package comportamentais.observer;


import comportamentais.observer.editor.Editor;
import comportamentais.observer.listeners.EmailNotificationListener;
import comportamentais.observer.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("aberto", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("salvo", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
