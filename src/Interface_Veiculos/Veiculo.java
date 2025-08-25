package Interface_Veiculos;

public interface Veiculo {
    public void acelerar();
    public void frear();
    default String ligarMotor(){
        return "Motor Ligado!";
    }
}
