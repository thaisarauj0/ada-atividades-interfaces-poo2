package Interface_Pagamentos;

public class Pix implements Pagamento {
    @Override
    public double pagar(double valor) {
        System.out.println("O valor de "+valor+" foi pago com Dinheiro");
        return valor;
    }
}
