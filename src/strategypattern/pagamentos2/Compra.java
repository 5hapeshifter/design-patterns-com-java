package strategypattern.pagamentos2;

// Contexto e o local que utiliza do strategy
public class Compra {

    private double valor;

    public Compra(double valor) {
        this.valor = valor;
    }

    /*
     Compra nao sabe qual sera a forma de pagamento.
     Agora o acoplamento é maior pq recebe a propria compra no método.
     Apesar do acoplamento maior, temos mais flexibilidade de lidar com o objeto Compra podendo
        manipulá-lo.
     */
    void processaCompra(PagamentoStrategy estrategiaPagamento) {
        estrategiaPagamento.pagar(this);
    }

    public double getValor() {
        return valor;
    }
}
