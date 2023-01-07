package strategypattern.imposto.calculos;

import strategypattern.imposto.Produto;

/*
Essa classe pode ter um ou mais métodos, como validarImposto(), getDetalhesImposto e etc que são
    utilizados pelo contexto, CalculadoraDeImposto (ou service da aplicação).
 */
public interface CalculoImpostoStrategy {

    double calculaImposto(double amount, Produto produto);
}
