package strategypattern.pagamentos;

// Contexto e o local que utiliza do strategy
public class Compra {

    private double valor;

    public Compra(double valor) {
        this.valor = valor;
    }

    // Compra nao sabe qual sera a forma de pagamento
    void processaCompra(PagamentoStrategy estrategiaPagamento) {
        estrategiaPagamento.pagar(valor);
    }
}
