import java.until;

public class CalculosGeometria {

    
    public static double volumeCubo(double lado) {
        return Math.pow(lado, 3);
    }

    
    public static double areaCubo(double lado) {
        return 6 * Math.pow(lado, 2);
    }

    
    public static double volumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    
    public static double areaEsfera(double raio) {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    
    public static double volumeCilindro(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    
    public static double areaCilindro(double raio, double altura) {
        return 2 * Math.PI * raio * (altura + raio);
    }
}