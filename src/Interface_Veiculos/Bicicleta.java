package Interface_Veiculos;

public class Bicicleta implements Veiculo {
    @Override
    public void acelerar() {

    }

    @Override
    public void frear() {

    }

    @Override
    public String ligarMotor() {
        return "Bicicleta não tem Motor!";
    }
}
