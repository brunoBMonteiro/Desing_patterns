package criacionais.singleton;

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("Se você vir o mesmo valor, o singleton foi reutilizado (show!)" + "\n" +
                "Se você vir valores diferentes, então 2 singletons foram criados (bahhhh!!)" + "\n\n" +
                "RESULTADO:" + "\n");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    // classe Foo
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    // classe Bar
    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
