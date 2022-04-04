package estruturais.facadeexemple2;

public class UsuarioExemplo {
    public static void main(String[] args) {
        ComputadorFacade facade = new ComputadorFacade();
        facade.run();
    }
}
