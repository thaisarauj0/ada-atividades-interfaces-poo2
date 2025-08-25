package Interface_Formas_Geometricas;

import java.util.List;

public class Desenho{
    List<Forma> formas;
    double area =0.0;

    public Desenho(List<Forma> formas) {
        this.formas = formas;
    }

    public double calcularAreaTotal() {
        for (Forma f : formas) {
            area += f.calcularArea();
        }
        return area;
    }
}
