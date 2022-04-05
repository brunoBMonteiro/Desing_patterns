package estruturais.facade;

// exemplo que abstrai lógica complexa
public class ComputadorFacade {
    private UnidadeCentralDeProcessamento unidadeCentralDeProcessamento;
    private Memoria memoria;
    private DiscoRigido discoRigido;


    public ComputadorFacade(UnidadeCentralDeProcessamento unidadeCentralDeProcessamento, Memoria memoria,
                            DiscoRigido discoRigido){
        this.unidadeCentralDeProcessamento = unidadeCentralDeProcessamento;
        this.memoria = memoria;
        this.discoRigido = discoRigido;
    }


    public void run(){
        this.unidadeCentralDeProcessamento.processaDado();
        this.memoria.carregaDado();
        this.discoRigido.leDado();
    }
}