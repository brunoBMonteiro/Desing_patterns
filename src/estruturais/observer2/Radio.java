package estruturais.observer2;

import java.util.Observable;
import java.util.Observer;

public class Radio implements Observer {

    @Override
    public void update(Observable agencia, Object novaNoticia) {
        if (agencia instanceof Editor) {
            System.out.println((String)novaNoticia);
        }
    }
}