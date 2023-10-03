import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangulo triangulo = new Triangulo();
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();
        Circulo circulo = new Circulo();
        Hexagono hexagono = new Hexagono();
        Cubo cubo = new Cubo();
        Paralelepipedo paralelepipedo = new Paralelepipedo();
        Esfera esfera = new Esfera();
        Piramide piramide = new Piramide();
        Cilindro cilindro = new Cilindro();
        Cone cone = new Cone();


        while (true){
            System.out.println("""
                    \nEscolha a figura plana que deseja calcular:\n
                    [0] Sair
                    [1] Triângulo Equilátero
                    [2] Quadrado
                    [3] Retangulo
                    [4] Circulo
                    [5] Hexagono
                    [6] Cubo
                    [7] Paralelepípedo
                    [8] Esfera
                    [9] Pirâmide de base quadrada
                    [10] Cilindro
                    [11] Cone
                    """);

            int escolha = sc.nextInt();

            if (escolha == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            if (escolha < 1 || escolha > 11) {
                System.out.println("Escolha inválida. Tente novamente.");
                continue;
            }

            switch (escolha){
                case 1 -> {
                    System.out.println("Digite o lado do triângulo equilátero: ");
                    triangulo.lado = sc.nextDouble();

                    if (triangulo.lado <= 0) {
                        System.out.println("O lado deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nPerimetro do triângulo: " + triangulo.calculoPerimetro() +
                            "\nÁrea do triãngulo: " + triangulo.calculoArea());
                }
                case 2 -> {
                    System.out.println("Digite o lado do quadrado: ");
                    quadrado.lado = sc.nextDouble();
                    if (quadrado.lado <= 0) {
                        System.out.println("O lado deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nPerimetro do quadrado: " + quadrado.perimetroQuadrado() +
                            "\nÁrea do quadrado: " + quadrado.areaQuadrado());
                }

                case 3-> {
                    System.out.println("Digite a base do retangulo: ");
                    retangulo.base = sc.nextDouble();
                    if (retangulo.base <= 0) {
                        System.out.println("A base deve ser positiva. Tente novamente.");
                        continue;
                    }

                    System.out.println("Digite a altura do retangulo: ");
                    retangulo.altura = sc.nextDouble();
                    if (retangulo.altura <= 0) {
                        System.out.println("A altura deve ser positiva. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nPerimetro do retangulo: " + retangulo.perimetroRetangulo() +
                            "\nÁrea do retangulo: " + retangulo.areaRetangulo());
                }

                case 4 -> {
                    System.out.println("Digite o raio do circulo: ");
                    circulo.raio = sc.nextDouble();
                    if (circulo.raio <= 0) {
                        System.out.println("O raio deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nPerimetro do circulo: " + circulo.perimetroCirculo() +
                            "\nÁrea do circulo: " + circulo.areaCirculo());
                }

                case 5 -> {
                    System.out.println("Digite o lado do hexagono: ");
                    hexagono.lado = sc.nextDouble();
                    if (hexagono.lado <= 0) {
                        System.out.println("O lado deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nPerimetro do hexagono: " + hexagono.perimetroHexagono() +
                            "\nÁrea do hexagono: " + hexagono.areaHexagono() + "\n");
                }

                case 6 -> {
                    System.out.println("Digite o comprimento de uma das arestas do cubo: ");
                    cubo.aresta = sc.nextDouble();
                    if (cubo.aresta <= 0) {
                        System.out.println("O comprimento deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nVolume do cubo: " + cubo.volumeCubo() +
                            "\nÁrea superficial do cubo: " + cubo.areaCubo() + "\n");
                }

                case 7 -> {
                    System.out.println("Digite a largura do paralelepípedo: ");
                    paralelepipedo.largura = sc.nextDouble();
                    if (paralelepipedo.largura <= 0) {
                        System.out.println("A largura deve ser positiva. Tente novamente.");
                        continue;
                    }

                    System.out.println("Digite a altura do paralelepípedo: ");
                    paralelepipedo.altura = sc.nextDouble();
                    if (paralelepipedo.altura <= 0) {
                        System.out.println("A altura deve ser positiva. Tente novamente.");
                        continue;
                    }

                    System.out.println("Digite o comprimento do paralelepípedo: ");
                    paralelepipedo.comprimento = sc.nextDouble();
                    if (paralelepipedo.comprimento <= 0) {
                        System.out.println("O comprimento deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nVolume do paralelepípedo: " + paralelepipedo.volumeParalelepipedo() +
                            "\nÁrea superficial do paralelepípedo: " + paralelepipedo.areaParalelepipedo() + "\n");
                }

                case 8 -> {
                    System.out.println("Digite o raio da esfera: ");
                    esfera.raio = sc.nextDouble();
                    if (esfera.raio <= 0) {
                        System.out.println("O raio deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nVolume da esfera: " + esfera.volumeEsfera() +
                            "\nÁrea da superfície da esfera: " + esfera.areaEsfera() + "\n");
                }

                case 9 -> {
                    System.out.println("Digite o comprimento do lado da base: ");
                    piramide.ladoBase = sc.nextDouble();
                    if (piramide.ladoBase <= 0) {
                        System.out.println("O comprimento deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("Digite a altura da pirâmide: ");
                    piramide.altura = sc.nextDouble();
                    if (piramide.altura <= 0) {
                        System.out.println("A altura deve ser positiva. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nVolume da pirâmide: " + piramide.volumePiramide() +
                            "\nÁrea superficial da pirâmide: " + piramide.areaPiramide() + "\n");
                }

                case 10 -> {
                    System.out.println("Digite o raio do cilindro: ");
                    cilindro.raio = sc.nextDouble();
                    if (cilindro.raio <= 0) {
                        System.out.println("O raio deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("Digite a altura do cilindro: ");
                    cilindro.altura = sc.nextDouble();
                    if (cilindro.altura <= 0) {
                        System.out.println("A altura deve ser positiva. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nVolume do cilindro: " + cilindro.volumeCilindro() +
                            "\nÁrea superficial do cilindro: " + cilindro.areaCilindro() + "\n");
                }

                case 11 -> {
                    System.out.println("Digite o raio do clone: ");
                    cone.raio = sc.nextDouble();
                    if (cone.raio <= 0) {
                        System.out.println("O raio deve ser positivo. Tente novamente.");
                        continue; // Volta ao início do loop
                    }

                    System.out.println("Digite a altura do cone: ");
                    cone.altura = sc.nextDouble();
                    if (cone.altura <= 0) {
                        System.out.println("A altura deve ser positiva. Tente novamente.");
                        continue; // Volta ao início do loop
                    }

                    System.out.println("\nVolume do cone: " + cone.volumeCone() +
                            "\nÁrea superficial do cone: " + cone.areaCone() + "\n");
                }
            }
        }
    }
}
