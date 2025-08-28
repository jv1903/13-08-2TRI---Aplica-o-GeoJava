public class Geoplana {
 
    public static double areaCirculo(double raio) {
        return Math.PI * raio * raio;
    }
    public static double perimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }
 
    public static double areaRetangulo(double base, double altura) {
        return base * altura;
    }
 
    public static double perimetroRetangulo(double base, double altura) {
        return 2 * (base + altura);
    }
 
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
 
    public static double perimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }
 
    public static double areaPoligonoRegular(double lado, int n) {
        return (n * lado * lado) / (4 * Math.tan(Math.PI / n));
    }
 
    public static double perimetroPoligonoRegular(double lado, int n) {
        return n *lado;
    }

}
 