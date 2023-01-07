package strategypattern.pagamentos2;

public class PagamentoCartaoDeCredito implements PagamentoStrategy {

    @Override
    public void pagar(Compra compra) {
        System.out.println("Pagou no crédito " + compra.getValor());
    }
}
