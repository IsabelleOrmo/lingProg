import interfaces.Forma2D;

public class App {
    public static void main(String[] args) throws Exception {
        Esfera es1 = new Esfera();

        es1.setRaio(10);
        System.out.printf("Perímetro da secção a 5 de distância de uma esfera de raio %.2f:  %.2f", es1.getRaio(), es1.calculaPerimetroSetor(5));

        Forma2D forma1 = new Quadrado(10);
        Forma2D forma2 = new Circulo(10);

        System.out.println("Área do quadrado:  " + forma1.calcularArea());
        System.out.println("Área do círculo:  " + forma2.calcularArea());
    }
}
