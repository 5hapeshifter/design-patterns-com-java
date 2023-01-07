package strategypattern.imposto;

import strategypattern.imposto.calculos.CalculoMGStrategy;
import strategypattern.imposto.calculos.CalculoPEStrategy;
import strategypattern.imposto.calculos.CalculoSPStrategy;
import strategypattern.imposto.calculos.ImpostoPorEstado;

public class ImpostoTest {

    public static void main(String[] args) {

        Produto produto = new Produto(
                "Arroz",
                ImpostoPorEstado.SP,
                10.00);

        CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto(new CalculoPEStrategy());
        double resultado = calculadoraDeImposto.calculaImposto(produto.getValorDaVenda(), produto);
        System.out.println("Imposto PE: " + resultado);

        calculadoraDeImposto = new CalculadoraDeImposto(new CalculoMGStrategy());
        resultado = calculadoraDeImposto.calculaImposto(produto.getValorDaVenda(), produto);
        System.out.println("Imposto MG: " + resultado);

        calculadoraDeImposto = new CalculadoraDeImposto(new CalculoSPStrategy());
        resultado = calculadoraDeImposto.calculaImposto(produto.getValorDaVenda(), produto);
        System.out.println("Imposto SP: " + resultado);
    }
}
