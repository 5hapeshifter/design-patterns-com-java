package strategypattern.imposto.calculos;

import strategypattern.imposto.Produto;

public class CalculoSP implements CalculoImposto {
    @Override
    public double calculaImposto(double amount, Produto produto) {
        return amount *= ImpostoPorEstado.SP.getValorDoImposto();
    }
}
