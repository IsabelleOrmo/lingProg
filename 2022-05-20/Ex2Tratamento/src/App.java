import interfaces.Forma2D;

public class App {
    public static void main(String[] args) throws Exception {
        // TODO: Fazer os try e catch na main para testar o programa
        Forma2D forma1 = new Quadrado(10);


        System.out.println("Área do quadrado:  " + forma1.calcularArea());
    }
}
