public class Esfera {
    double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    double volumeEsfera() {
        return ((4 * Math.PI) * Math.pow(raio, 3) / 3);
    }
    double areaEsfera() {
        return (Math.PI * Math.pow(raio, 2));
    }
}
