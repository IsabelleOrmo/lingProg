public class ExeTryCatch {
    private static String teste = "rapaiz";

    public static void testeToUpper() {
        try {
            System.out.println(teste.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Erro: A string não deve ser nula!");
        } finally {
            System.out.println("Olha pelo lado bom, podia ser C#");
        }
    }
}