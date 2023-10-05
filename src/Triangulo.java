public class Triangulo{
    double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    double calculoPerimetro() {
        return lado * 3;
    }
    double calculoArea() {
        if (lado < 0) {
            System.out.println("Não é possível calcular a raiz quadrada de um número negativo!");
        }
        return (Math.pow(lado, 2) * Math.sqrt(3)/4);
    }
}
