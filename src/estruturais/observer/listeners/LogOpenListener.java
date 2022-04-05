package estruturais.observer.listeners;


import java.io.File;

public class LogOpenListener implements EventListener {
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Salvar para registrar " + log + ": Alguém realizou " + eventType + " operação com o seguinte arquivo: " + file.getName());
    }
}