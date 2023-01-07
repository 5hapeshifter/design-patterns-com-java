package strategypattern.pagamentos3;

public class PagamentoCartaoDeDebito implements PagamentoStrategy {

    @Override
    public void pagar(Pagavel pagavel) {
        System.out.println("Pagou no débito " + pagavel.getValor());
    }
}
