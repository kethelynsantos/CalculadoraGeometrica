public class Cubo {
    double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    double volumeCubo() {
        return Math.pow(aresta, 3);
    }
    double areaCubo() {
        return 6 * (Math.pow(aresta, 2));
    }
}
