import java.util.Scanner;
 
public class Principal {

    private static Object geoplana;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;
 
        while (opcao != 3) {

            System.out.println("=== Menu ===");
            System.out.println("1. Geometria Plana");
            System.out.println("2. Geometria Espacial");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
 
            switch (opcao) {

                case 1:
                    menuPlana(sc);
                    break;

                case 2:
                    menuEspacial(sc);
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();

    }
 
    private static void menuPlana(Scanner sc) {
        System.out.println("Figuras Planas:");
        System.out.println("1. Círculo");
        System.out.println("2. Retângulo");
        System.out.println("3. Triângulo");
        System.out.print("Escolha: ");
        int figura = sc.nextInt();
 
        switch (figura) {
            case 1:
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                System.out.printf("Área: %.2f\n", geoplana.areaCirculo(raio));
                System.out.printf("Perímetro: %.2f\n", geoplana.perimetroCirculo(raio));
                break;

            case 2:

                System.out.print("Base: ");
                double base = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                System.out.printf("Área: %.2f\n", geoplana.areaRetangulo(base, altura));
                System.out.printf("Perímetro: %.2f\n", geoplana.perimetroRetangulo(base, altura));
                break;

            case 3:

                System.out.print("Base: ");
                base = sc.nextDouble();
                System.out.print("Altura: ");
                altura = sc.nextDouble();
                System.out.print("Lado 1: ");
                double l1 = sc.nextDouble();
                System.out.print("Lado 2: ");
                double l2 = sc.nextDouble();
                System.out.print("Lado 3: ");
                double l3 = sc.nextDouble();
                System.out.printf("Área: %.2f\n", geoplana.areaTriangulo(base, altura));
                System.out.printf("Perímetro: %.2f\n", geoplana.perimetroTriangulo(l1, l2, l3));
                break;

            default:

                System.out.println("Opção inválida!");

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
            case 1:
                System.out.print("Lado: ");
                double lado = sc.nextDouble();
                System.out.printf("Volume: %.2f\n", geoespacial.volCubo(lado));
                System.out.printf("Área superficial: %.2f\n", geoespacial.arCubo(lado));
                break;

            case 2:
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                System.out.printf("Volume: %.2f\n", geoespacial.volEsfera(raio));
                System.out.printf("Área superficial: %.2f\n", geoespacial.arEsfera(raio));
                break;

            case 3:
                System.out.print("Raio: ");
                raio = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                System.out.printf("Volume: %.2f\n", geoespacial.volCilindro(raio, altura));
                System.out.printf("Área superficial: %.2f\n", geoespacial.arCilindro(raio, altura));
                break;

            case 4:
                System.out.print("Base: ");
                double base = sc.nextDouble();
                System.out.print("Altura: ");
                double alturaPrisma = sc.nextDouble();
                System.out.print("Comprimento: ");
                double comprimento = sc.nextDouble();
                System.out.printf("Volume: %.2f\n", geoespacial.volPrismaRetangular(base, alturaPrisma, comprimento));
                System.out.printf("Área superficial: %.2f\n", geoespacial.arPrismaRetangular(base, alturaPrisma, comprimento));

                break;

            default:
                System.out.println("Opção inválida!");

        }

    }

}
 
