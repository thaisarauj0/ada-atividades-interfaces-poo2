package Interface_Formas_Geometricas;

public class Circulo implements Forma {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public Circulo() {}

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }


}
