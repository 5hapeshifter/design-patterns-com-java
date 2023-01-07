package strategypattern.imposto;

import strategypattern.imposto.calculos.CalculoImpostoStrategy;

/*
Essa classe é o contexto do uso do strategy, ela fala direto com a InterfaceStrategy, nesse caso
    é o CalculoImpostoStrategy, ela não fala com as implementações concretas.
 */
public class CalculadoraDeImposto {

    private CalculoImpostoStrategy calculoImpostoStrategy;

    public CalculadoraDeImposto(CalculoImpostoStrategy calculoImpostoStrategy) {
        this.calculoImpostoStrategy = calculoImpostoStrategy;
    }

    public double calculaImposto(double valor, Produto produto) {
        return calculoImpostoStrategy.calculaImposto(valor, produto);
    }

}
