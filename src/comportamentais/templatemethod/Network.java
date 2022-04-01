package comportamentais.templatemethod;

/**
 * Classe base da rede social.
 */
public abstract class Network {
    String userName;
    String password;

    Network() {}

    /**
     * Publique os dados em qualquer rede.
     */
    public boolean post(String message) {

        /*
            Autentique antes de postar. Cada rede usa um método de autenticação diferente.
         */

        if (logIn(this.userName, this.password)) {
            // Envie os dados da postagem.
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
