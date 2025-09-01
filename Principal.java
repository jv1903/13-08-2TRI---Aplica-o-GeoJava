import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int opcao = 0;
            
            while (opcao != 3) {
                
                System.out.println("=== Menu ===");
                System.out.println("1. Geometria Plana");
                System.out.println("2. Geometria Espacial");
                System.out.println("3. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                
                switch (opcao) {
                    case 1 -> menuPlana(sc);
                        
                    case 2 -> menuEspacial(sc);
                        
                    case 3 -> System.out.println("Encerrando...");
                        
                    default -> System.out.println("Opção inválida!");
                }
            }
        }
    }

    private static void menuPlana(Scanner sc) {
        System.out.println("Figuras Planas:");
        System.out.println("1. Círculo");
        System.out.println("2. Retângulo");
        System.out.println("3. Triângulo");
        System.out.println("4. Polígono Regular");
        System.out.print("Escolha: ");
        int figura = sc.nextInt();

        switch (figura) {
            case 1 ->  { // Círculo
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                System.out.printf("Área: %.2f\n", Geoplana.areaCirculo(raio));
                System.out.printf("Perímetro: %.2f\n", Geoplana.perimetroCirculo(raio));
            }

            case 2 ->  { // Retângulo
                System.out.print("Base: ");
                double base = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                System.out.printf("Área: %.2f\n", Geoplana.areaRetangulo(base, altura));
                System.out.printf("Perímetro: %.2f\n", Geoplana.perimetroRetangulo(base, altura));
            }

            case 3 ->  { // Triângulo
                System.out.print("Base: ");
                double base = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                System.out.print("Lado 1: ");
                double l1 = sc.nextDouble();
                System.out.print("Lado 2: ");
                double l2 = sc.nextDouble();
                System.out.print("Lado 3: ");
                double l3 = sc.nextDouble();
                System.out.printf("Área: %.2f\n", Geoplana.areaTriangulo(base, altura));
                System.out.printf("Perímetro: %.2f\n", Geoplana.perimetroTriangulo(l1, l2, l3));
            }

            case 4 ->  { // Polígono Regular
                System.out.print("Número de lados: ");
                int n = sc.nextInt();
                System.out.print("Medida do lado: ");
                double lado = sc.nextDouble();
                System.out.printf("Área: %.2f\n", Geoplana.areaPoligonoRegular(lado, n));
                System.out.printf("Perímetro: %.2f\n", Geoplana.perimetroPoligonoRegular(lado, n));
            }

            default -> System.out.println("Opção inválida!");
        }
    }

    private static void menuEspacial(Scanner sc) {
        System.out.println("Sólidos Geométricos:");
        System.out.println("1. Cubo");
        System.out.println("2. Esfera");
        System.out.println("3. Cilindro");
        System.out.println("4. Prisma Retangular");
        System.out.print("Escolha: ");
        int solido = sc.nextInt();

        switch (solido) {
            case 1 ->  { // Cubo
                System.out.print("Lado: ");
                double lado = sc.nextDouble();
                System.out.printf("Volume: %.2f\n", Geoespacial.voluCubo(lado));
                System.out.printf("Área superficial: %.2f\n", Geoespacial.arCubo(lado));
            }

            case 2 ->  { // Esfera
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                System.out.printf("Volume: %.2f\n", Geoespacial.volEsfera(raio));
                System.out.printf("Área superficial: %.2f\n", Geoespacial.arEsfera(raio));
            }

            case 3 ->  { // Cilindro
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                System.out.printf("Volume: %.2f\n", Geoespacial.volCilindro(raio, altura));
                System.out.printf("Área superficial: %.2f\n", Geoespacial.arCilindro(raio, altura));
            }

            case 4 ->  { // Prisma Retangular
                System.out.print("Base: ");
                double base = sc.nextDouble();
                System.out.print("Altura: ");
                double alturaPrisma = sc.nextDouble();
                System.out.print("Comprimento: ");
                double comprimento = sc.nextDouble();
                System.out.printf("Volume: %.2f\n", Geoespacial.volPrismaRetangular(base, alturaPrisma, comprimento));
                System.out.printf("Área superficial: %.2f\n", Geoespacial.arPrismaRetangular(base, alturaPrisma, comprimento));
            }

            default -> System.out.println("Opção inválida!");
        }
    }
}
