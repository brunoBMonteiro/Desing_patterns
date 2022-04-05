package estruturais.facade;

public class UsuarioExemplo {
    public static void main(String[] args) {
        ComputadorFacade facade = new ComputadorFacade(new UnidadeCentralDeProcessamento(),
                new Memoria(), new DiscoRigido());
        facade.run();
    }
}
