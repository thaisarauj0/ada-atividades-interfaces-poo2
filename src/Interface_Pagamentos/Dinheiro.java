package Interface_Pagamentos;

public class Dinheiro implements Pagamento {
    @Override
    public double pagar(double valor) {
        System.out.println("O valor de "+valor+" foi pago com Dinheiro");
        return valor;
    }
}
