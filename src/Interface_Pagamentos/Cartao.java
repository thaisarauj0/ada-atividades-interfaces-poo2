package Interface_Pagamentos;

public class Cartao implements Pagamento {
    @Override
    public double pagar(double valor) {
        System.out.println("O valor de "+valor+" foi pago com Cartão de Crédito");
        return valor;
    }
}
