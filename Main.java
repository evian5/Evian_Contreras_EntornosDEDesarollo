public class Main {
    public static void main(String[] args) {
 
        circulo circulo1 = new circulo(3, " verde");
        cuadrado cuadrado1 = new cuadrado(3,3, "rojo");
        
        double ladoA = cuadrado1.getLadoA();
        double ladoB = cuadrado1.getLadoB();
        double area1 = ladoA* ladoB;
        System.out.println("Area cuadrado" + area1);
        
        double radio1 = circulo1.getRadio();
        double area2 = radio1*3.14;
        System.out.println("Area circulo" + area2);
        
        double diferencia = area1*area2;
        System.out.println("Diferencia areas" + diferencia);
        
        System.out.println("Cuadrado:" +cuadrado1);
        System.out.println("Circulo:" +circulo1);
        System.out.println("diferencia:" +diferencia);
               
    }
    
}