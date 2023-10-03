public class Cone {
    double raio;
    double altura;

    double volumeCone() {
        return (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;
    }

    double areaCone() {
        double areaLateral = Math.PI * raio * Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
        double areaDaBase = Math.PI * Math.pow(raio, 2);
        return areaLateral + areaDaBase;
    }
}
