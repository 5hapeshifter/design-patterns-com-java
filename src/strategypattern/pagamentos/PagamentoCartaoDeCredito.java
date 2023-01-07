package strategypattern.pagamentos;

public class PagamentoCartaoDeCredito implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagou no crédito " + valor);
    }
}
