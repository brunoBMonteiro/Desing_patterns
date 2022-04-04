package estruturais.facadeexemple2;

// exemplo que abstrai lógica complexa
public class ComputadorFacade {
    private UnidadeCentralDeProcessamento unidadeCentralDeProcessamento;
    private Memoria memoria;
    private DiscoRigido discoRigido;


    public ComputadorFacade(){
        this.unidadeCentralDeProcessamento = new UnidadeCentralDeProcessamento();
        this.memoria = new Memoria();
        this.discoRigido = new DiscoRigido();
    }

    public void run(){
        unidadeCentralDeProcessamento.processaDado();
        memoria.carregaDado();
        discoRigido.leDado();
    }
}
