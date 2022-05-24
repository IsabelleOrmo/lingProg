import interfaces.AreaCalculavel;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\nCálculo do quadrado.");
        try {
            AreaCalculavel forma1 = new Quadrado(-17);
            System.out.println("Área do quadrado:  " + forma1.calcularArea());
        } catch(IllegalArgumentException e) {
            System.out.println("Erro:  " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n\nCálculo do retângulo.");
        try {
            AreaCalculavel forma2 = new Retangulo(4, 4);
            System.out.println("Área do retângulo:  " + forma2.calcularArea());
        } catch(IllegalArgumentException e) {
            System.out.println("Erro:  " + e.getMessage());
            e.printStackTrace();
        }
    }
}
