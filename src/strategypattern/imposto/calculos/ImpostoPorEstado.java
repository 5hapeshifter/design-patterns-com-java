package strategypattern.imposto.calculos;

public enum ImpostoPorEstado {

    SP(0.05),
    MG(0.10),
    PE(0.15);

    private double valorDoImposto;

    ImpostoPorEstado(double valorDoImposto) {
        this.valorDoImposto = valorDoImposto;
    }

    public double getValorDoImposto() {
        return valorDoImposto;
    }

}
