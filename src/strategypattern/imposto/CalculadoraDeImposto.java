package strategypattern.imposto;

import strategypattern.imposto.calculos.CalculoImposto;

public class CalculadoraDeImposto {

    private CalculoImposto calculoImposto;

    public CalculadoraDeImposto(CalculoImposto calculoImposto) {
        this.calculoImposto = calculoImposto;
    }

    public double calculaImposto(double valor, Produto produto) {
        return calculoImposto.calculaImposto(valor, produto);
    }

}
