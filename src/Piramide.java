public class Piramide {
    double ladoBase;
    double altura;

    double volumePiramide() {
        return (1.0 / 3.0) * Math.pow(ladoBase, 2) * altura;
    }

    double areaPiramide() {
        double areaBase = ladoBase * ladoBase;
        double areaLateral = 4.0 * (ladoBase * altura) / 2.0; // Área de todas as quatro faces laterais
        return areaBase + areaLateral;
    }
}

