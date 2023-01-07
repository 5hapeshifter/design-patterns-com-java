package strategypattern.pagamentos3;

public class PagamentoTest3 {

    public static void main(String[] args) {

        double valor = 10.0;
        Compra compra = new Compra(valor);

        compra.processaCompra(new PagamentoCartaoDeCredito());
        compra.processaCompra(new PagamentoCartaoDeDebito());

    }
}
