public class Hexagono {
    double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    double perimetroHexagono() {
        return lado * 6;
    }

    double areaHexagono() {
        if (lado < 0) {
            System.out.println("Não é possível calcular a raiz quadrada de um número negativo!");
        }
        return (Math.pow(lado, 2) * Math.sqrt(3) / 4) * 6;
    }
}
