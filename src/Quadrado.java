public class Quadrado {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    double perimetroQuadrado() {
        return lado * 4;
    }
    double areaQuadrado() {
        return lado * lado;
    }
}
