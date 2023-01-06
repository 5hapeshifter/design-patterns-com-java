package strategypattern.imposto.calculos;

import strategypattern.imposto.Produto;

public interface CalculoImposto {

    double calculaImposto(double amount, Produto produto);
}
