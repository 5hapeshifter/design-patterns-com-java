package nullobjectspattern;

public class CookieFactory {

    public static Carrinho criarCarrinho(Request request){
        Carrinho carrinho = new Carrinho();
        CarrinhoNulo carrinhoNulo = new CarrinhoNulo();
        if (request == null) {
            return carrinhoNulo;
        }
        carrinho.setNomeUsuario(request.getUsername());
        carrinho.setQtd(request.getQtd());
        carrinho.setValor(request.getValor());
        return carrinho;
    }
}
