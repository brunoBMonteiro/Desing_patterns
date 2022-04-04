package estruturais.facadeexemple;

public class PedidoFacadeApplication {
    public static void main ( String [] args ) {
        Estoque estoque = new Estoque () ;
        Financeiro financeiro = new Financeiro () ;
        PosVenda posVenda = new PosVenda () ;
        PedidoFacade facade = new PedidoFacade(estoque, financeiro, posVenda) ;
        Pedido pedido = new Pedido (" Notebook " , " Rafael Cosentino " ,
                " Av Brigadeiro Faria Lima , 1571 , São Paulo , SP " ) ;
        facade . registraPedido ( pedido ) ;
    }
}