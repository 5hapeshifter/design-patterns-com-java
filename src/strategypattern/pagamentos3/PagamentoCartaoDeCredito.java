package strategypattern.pagamentos3;

public class PagamentoCartaoDeCredito implements PagamentoStrategy {

    @Override
    public void pagar(Pagavel pagavel) {
        System.out.println("Pagou no crédito " + pagavel.getValor());
    }
}
