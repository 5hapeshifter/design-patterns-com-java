package nullobjectspattern;

public class NullObjectsTest {

    public static void main(String[] args) {
        Request requestPreenchida = new Request();
        Request requestNula = new Request();

        ApresentacaoCarrinhoBeforePattern beforePattern = new ApresentacaoCarrinhoBeforePattern();
        ApresentacaoCarrinhoAfterPattern afterPattern = new ApresentacaoCarrinhoAfterPattern();

        requestPreenchida.setUserCarrinho("Suleiman");
        requestPreenchida.setUsername("Suleiman");
        requestPreenchida.setQtd(1);
        requestPreenchida.setValor(10.0);

        System.out.println("-------- Sem o padrão NullObject --------");
        beforePattern.colocarInformacoesCarrinho(requestPreenchida);
        beforePattern.colocarInformacoesCarrinho(requestNula);

        System.out.println("-------- Sem o padrão NullObject --------");
        afterPattern.colocarInformacoesCarrinho(requestPreenchida);
        afterPattern.colocarInformacoesCarrinho(requestNula);


    }
}
