public class Paralelepipedo {
    double largura;
    double altura;
    double comprimento;

    public Paralelepipedo(double largura, double altura, double comprimento) {
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    double volumeParalelepipedo() {
        return largura * altura * comprimento;
    }
    double areaParalelepipedo() {
        return (2 * altura * comprimento) + (2 * altura * largura) + (2 * largura * comprimento);
    }
}
