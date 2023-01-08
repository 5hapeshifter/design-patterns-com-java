package nullobjectspattern;

public class Request {
    private double valor;
    private int qtd;
    private String username;
    private String userCarrinho;

    public Request() {
    }

    public Request(double valor, int qtd, String username) {
        this.valor = valor;
        this.qtd = qtd;
        this.username = username;
    }

    public double getValor() {
        return valor;
    }

    public int getQtd() {
        return qtd;
    }

    public String getUsername() {
        return username;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserCarrinho() {
        return userCarrinho;
    }

    public void setUserCarrinho(String userCarrinho) {
        this.userCarrinho = userCarrinho;
    }

    @Override
    public String toString() {
        return "Request{" +
                "valor=" + valor +
                ", qtd=" + qtd +
                ", username='" + username + '\'' +
                ", userCarrinho='" + userCarrinho + '\'' +
                '}';
    }
}
