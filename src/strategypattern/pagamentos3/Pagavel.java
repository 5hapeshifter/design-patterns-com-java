package strategypattern.pagamentos3;

// Interface para nao permitir que as estrategias nao conhecam as classes concretas
public interface Pagavel {
    double getValor();
}
