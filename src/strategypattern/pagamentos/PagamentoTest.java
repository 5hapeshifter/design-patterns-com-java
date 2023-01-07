package strategypattern.pagamentos;

public class PagamentoTest {

    public static void main(String[] args) {

        double valor = 10.0;
        Compra compra = new Compra(valor);

        compra.processaCompra(new PagamentoCartaoDeCredito());
        compra.processaCompra(new PagamentoCartaoDeDebito());

    }
}
