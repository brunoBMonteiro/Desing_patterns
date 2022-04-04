package estruturais.facadeexemple;

public class PedidoFacade {
    private Estoque estoque;
    private Financeiro financeiro;
    private PosVenda posVenda;

    public PedidoFacade(Estoque estoque, Financeiro financeiro, PosVenda posVenda) {
        this.estoque = estoque;
        this.financeiro = financeiro;
        this.posVenda = posVenda;
    }

    public void registraPedido(Pedido pedido){
        this.estoque.enviaProduto(pedido.getProduto(), pedido.getEnderecoDeEntrega());
        this.financeiro.fatura(pedido.getCliente(), pedido.getCliente());
        this.posVenda.agendaContato(pedido.getCliente(), pedido.getProduto());
    }
}