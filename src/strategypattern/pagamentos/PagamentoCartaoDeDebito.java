package strategypattern.pagamentos;

public class PagamentoCartaoDeDebito implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagou no débito " + valor);
    }
}
