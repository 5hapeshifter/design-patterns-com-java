package nullobjectspattern;

public class ApresentacaoCarrinhoBeforePattern {

    public void colocarInformacoesCarrinho(Request request) {

        Carrinho c = CookieFactory.criarCarrinho(request);

        if (c != null) {
            request.setValor(c.getValor());
            request.setQtd(c.getQtd());
        } else {
            request.setValor(0.0);
            request.setQtd(0);
        }

        if (request.getUsername() == null) {
            if (c != null) {
                request.setUserCarrinho(c.getNomeUsuario());
            } else {
                request.setUserCarrinho("Pegando usuário de outro lugar.");
            }
        } else {
            request.setUserCarrinho(request.getUsername());
        }
        System.out.println(request);
    }
}
