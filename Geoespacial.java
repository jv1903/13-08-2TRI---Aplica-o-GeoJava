public class Geoespacial {
 
    public static double voluCubo(double lado) {
        return Math.pow(lado, 3);
    }
 
    public static double arCubo(double lado) {
        return 6 * lado * lado;
    }
 
    public static double volEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
 
    public static double arEsfera(double raio) {
        return 4 * Math.PI * raio * raio;
    }
 
    public static double volCilindro(double raio, double altura) {
        return Math.PI * raio * raio * altura;
    }
 
    public static double arCilindro(double raio, double altura) {
        return 2 * Math.PI * raio * (raio + altura);
    }
 
    public static double volPrismaRetangular(double base, double altura, double comprimento) {
        return base * altura * comprimento;
    }
 
    public static double arPrismaRetangular(double base, double altura, double comprimento) {
        return 2 * (base * altura + base * comprimento + altura * comprimento);
    }
}