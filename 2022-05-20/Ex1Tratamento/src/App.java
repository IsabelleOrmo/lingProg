public class App {
    public static void main(String[] args) throws Exception {
        Object o = null;

        try {
            o.toString();
        } catch (NullPointerException e) {
            System.out.println("O objeto não pode ser convertido para string, pois está vazio.");
        }

        System.out.println("Programa encerrado.");
    }
}
