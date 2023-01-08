package nullobjectspattern;

public class ApresentacaoCarrinhoAfterPattern {

    public void colocarInformacoesCarrinho(Request request) {

        Carrinho c = CookieFactory.criarCarrinho(request);
        request.setValor(c.getValor());
        request.setQtd(c.getQtd());

        if (request.getUsername() == null) {
                request.setUserCarrinho(c.getNomeUsuario());
        } else {
            request.setUserCarrinho(request.getUsername());
        }
        System.out.println(request);
    }
}
