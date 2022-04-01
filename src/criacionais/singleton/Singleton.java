package criacionais.singleton;

public final class Singleton {
    // O campo deve ser declarado volátil para que o bloqueio de verificação dupla funcione

    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }


    public static Singleton getInstance(String value) {
         /*
            A abordagem adotada aqui é chamada de bloqueio de dupla verificação (DCL). Isto
            existe para evitar a condição de corrida entre vários threads que podem
            tentar obter a instância singleton ao mesmo tempo, criando
            instâncias como resultado.
         */

        Singleton result = instance;
        if (instance != null) {
            return instance;
        }

        synchronized(Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }

}
