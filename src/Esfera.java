public class Esfera {
    double pi = 3.14;
    double raio;

    double volumeEsfera() {
        return ((4 * pi) * Math.pow(raio, 3) / 3);
    }
    double areaEsfera() {
        return (pi * Math.pow(raio, 2));
    }
}
