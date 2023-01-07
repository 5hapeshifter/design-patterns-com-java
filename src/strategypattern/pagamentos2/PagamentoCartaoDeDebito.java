package strategypattern.pagamentos2;

public class PagamentoCartaoDeDebito implements PagamentoStrategy {

    @Override
    public void pagar(Compra compra) {
        System.out.println("Pagou no débito " + compra.getValor());
    }
}
