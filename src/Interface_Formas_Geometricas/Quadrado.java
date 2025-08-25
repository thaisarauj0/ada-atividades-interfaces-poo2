package Interface_Formas_Geometricas;

public class Quadrado implements Forma {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public Quadrado() {}
    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
