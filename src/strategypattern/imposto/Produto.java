package strategypattern.imposto;

import strategypattern.imposto.calculos.ImpostoPorEstado;

public class Produto {

    private String nomeDoProduto;
    private ImpostoPorEstado impostoPorEstado;
    private double valorDaVenda;

    public Produto(String nomeDoProduto, ImpostoPorEstado impostoPorEstado, double valorDaVenda) {
        this.nomeDoProduto = nomeDoProduto;
        this.impostoPorEstado = impostoPorEstado;
        this.valorDaVenda = valorDaVenda;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public ImpostoPorEstado getImpostoPorEstado() {
        return impostoPorEstado;
    }

    public void setImpostoPorEstado(ImpostoPorEstado impostoPorEstado) {
        this.impostoPorEstado = impostoPorEstado;
    }

    public double getValorDaVenda() {
        return valorDaVenda;
    }

    public void setValorDaVenda(double valorDaVenda) {
        this.valorDaVenda = valorDaVenda;
    }
}
