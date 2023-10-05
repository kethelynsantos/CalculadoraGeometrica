public class Retangulo {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double perimetroRetangulo() {
        return 2 * (base + altura);
    }
    double areaRetangulo() {
        return base * altura;
    }
}
