package strategypattern.imposto;

import strategypattern.imposto.calculos.CalculoPE;
import strategypattern.imposto.calculos.ImpostoPorEstado;

public class StrategyTest {

    public static void main(String[] args) {

        Produto produto = new Produto(
                "Arroz",
                ImpostoPorEstado.SP,
                10.00);

        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto(new CalculoPE());
        double resultado = calculadoraDeImposto.calculaImposto(produto.getValorDaVenda(), produto);
        System.out.println(resultado);

    }
}
