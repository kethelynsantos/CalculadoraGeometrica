public class Circulo {
    double pi = 3.14;
    double raio;

    double perimetroCirculo() {
        return ((2 * pi) * raio);
    }
    double areaCirculo() {
        return (pi * Math.pow(raio, 2));
    }
}
