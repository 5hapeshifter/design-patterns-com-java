package strategypattern.imposto.calculos;

import strategypattern.imposto.Produto;

/*
Implementação da interface, cuja qual o contexto(Calculadora) de imposto não sabe como se comporta.
 */
public class CalculoMGStrategy implements CalculoImpostoStrategy {
    @Override
    public double calculaImposto(double amount, Produto produto) {
        return amount *= ImpostoPorEstado.MG.getValorDoImposto();
    }
}
