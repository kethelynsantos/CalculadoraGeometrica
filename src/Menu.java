import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("""
                    \nEscolha a figura plana que deseja calcular:
                    
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
                System.out.println("Programa encerrando...");
                break;
            }

            if (escolha < 1 || escolha > 11) {
                System.out.println("Escolha inválida. Tente novamente.");
                continue;
            }

            switch (escolha){
                case 1 -> {
                    double lado;

                    System.out.println("Digite o lado do triângulo equilátero: ");
                    lado = sc.nextDouble();

                    Triangulo triangulo = new Triangulo(lado);

                    if (lado <= 0) {
                        System.out.println("O lado deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nPerimetro do triângulo: " + triangulo.calculoPerimetro() +
                            "\nÁrea do triãngulo: " + triangulo.calculoArea() + "\n");
                }
                case 2 -> {
                    double lado;

                    System.out.println("Digite o lado do quadrado: ");
                    lado = sc.nextDouble();

                    Quadrado quadrado = new Quadrado(lado);

                    if (lado <= 0) {
                        System.out.println("O lado deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nPerimetro do quadrado: " + quadrado.perimetroQuadrado() +
                            "\nÁrea do quadrado: " + quadrado.areaQuadrado() + "\n");
                }

                case 3-> {
                    double base;
                    double altura;

                    System.out.println("Digite a base do retangulo: ");
                    base = sc.nextDouble();

                    if (base <= 0) {
                        System.out.println("A base deve ser positiva. Tente novamente.");
                        continue;
                    }

                    System.out.println("Digite a altura do retangulo: ");
                    altura = sc.nextDouble();

                    if (altura <= 0) {
                        System.out.println("A altura deve ser positiva. Tente novamente.");
                        continue;
                    }

                    Retangulo retangulo = new Retangulo(base, altura);

                    System.out.println("\nPerimetro do retangulo: " + retangulo.perimetroRetangulo() +
                            "\nÁrea do retangulo: " + retangulo.areaRetangulo() + "\n");
                }

                case 4 -> {
                    double raio;

                    System.out.println("Digite o raio do circulo: ");
                    raio = sc.nextDouble();

                    Circulo circulo = new Circulo(raio);

                    if (raio <= 0) {
                        System.out.println("O raio deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nPerimetro do circulo: " + circulo.perimetroCirculo() +
                            "\nÁrea do circulo: " + circulo.areaCirculo() + "\n");
                }

                case 5 -> {
                    double lado;

                    System.out.println("Digite o lado do hexagono: ");
                    lado = sc.nextDouble();

                    Hexagono hexagono = new Hexagono(lado);

                    if (lado <= 0) {
                        System.out.println("O lado deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nPerimetro do hexagono: " + hexagono.perimetroHexagono() +
                            "\nÁrea do hexagono: " + hexagono.areaHexagono() + "\n");
                }

                case 6 -> {
                    double aresta;

                    System.out.println("Digite o comprimento de uma das arestas do cubo: ");
                    aresta = sc.nextDouble();

                    Cubo cubo = new Cubo(aresta);

                    if (aresta <= 0) {
                        System.out.println("O comprimento deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nVolume do cubo: " + cubo.volumeCubo() +
                            "\nÁrea superficial do cubo: " + cubo.areaCubo() + "\n");
                }

                case 7 -> {
                    double largura;
                    double altura;
                    double comprimento;

                    System.out.println("Digite a largura do paralelepípedo: ");
                    largura = sc.nextDouble();
                    if (largura <= 0) {
                        System.out.println("A largura deve ser positiva. Tente novamente.");
                        continue;
                    }

                    System.out.println("Digite a altura do paralelepípedo: ");
                    altura = sc.nextDouble();
                    if (altura <= 0) {
                        System.out.println("A altura deve ser positiva. Tente novamente.");
                        continue;
                    }

                    System.out.println("Digite o comprimento do paralelepípedo: ");
                    comprimento = sc.nextDouble();

                    Paralelepipedo paralelepipedo = new Paralelepipedo(largura, altura, comprimento);

                    if (comprimento <= 0) {
                        System.out.println("O comprimento deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nVolume do paralelepípedo: " + paralelepipedo.volumeParalelepipedo() +
                            "\nÁrea superficial do paralelepípedo: " + paralelepipedo.areaParalelepipedo() + "\n");
                }

                case 8 -> {
                    double raio;

                    System.out.println("Digite o raio da esfera: ");
                    raio = sc.nextDouble();

                    Esfera esfera = new Esfera(raio);

                    if (raio <= 0) {
                        System.out.println("O raio deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nVolume da esfera: " + esfera.volumeEsfera() +
                            "\nÁrea da superfície da esfera: " + esfera.areaEsfera() + "\n");
                }

                case 9 -> {
                    double ladoBase;
                    double altura;

                    System.out.println("Digite o comprimento do lado da base: ");
                    ladoBase = sc.nextDouble();

                    if (ladoBase <= 0) {
                        System.out.println("O comprimento deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("Digite a altura da pirâmide: ");
                    altura = sc.nextDouble();

                    Piramide piramide = new Piramide(ladoBase, altura);

                    if (altura <= 0) {
                        System.out.println("A altura deve ser positiva. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nVolume da pirâmide: " + piramide.volumePiramide()+
                            "\nÁrea superficial da pirâmide: " + piramide.areaPiramide() + "\n");
                }

                case 10 -> {
                    double raio;
                    double altura;

                    System.out.println("Digite o raio do cilindro: ");
                    raio = sc.nextDouble();

                    if (raio <= 0) {
                        System.out.println("O raio deve ser positivo. Tente novamente.");
                        continue;
                    }

                    System.out.println("Digite a altura do cilindro: ");
                    altura = sc.nextDouble();

                    Cilindro cilindro = new Cilindro(raio, altura);

                    if (cilindro.altura <= 0) {
                        System.out.println("A altura deve ser positiva. Tente novamente.");
                        continue;
                    }

                    System.out.println("\nVolume do cilindro: " + cilindro.volumeCilindro() +
                            "\nÁrea superficial do cilindro: " + cilindro.areaCilindro() + "\n");
                }

                case 11 -> {
                    double raio;
                    double altura;

                    System.out.println("Digite o raio do clone: ");
                    raio = sc.nextDouble();

                    if (raio <= 0) {
                        System.out.println("O raio deve ser positivo. Tente novamente.");
                        continue; // Volta ao início do loop
                    }

                    System.out.println("Digite a altura do cone: ");
                    altura = sc.nextDouble();

                    Cone cone = new Cone(raio, altura);

                    if (cone.altura <= 0) {
                        System.out.println("A altura deve ser positiva. Tente novamente.");
                        continue; // Volta ao início do loop
                    }

                    System.out.println("\nVolume do cone: " + cone.volumeCone() +
                            "\nÁrea superficial do cone: " + cone.areaCone() + "\n");
                }
            }

            System.out.println("Deseja continuar?\n[1] sim\n[2] não");
            int decisao = sc.nextInt();

            if (decisao == 1) {
                continue;
            }

            if (decisao == 2) {
                System.out.println("\nPrograma encerrando...");
                break;
            }
        }

    }
}
