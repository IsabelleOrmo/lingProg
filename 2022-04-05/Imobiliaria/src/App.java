public class App {
    public static void main(String[] args) throws Exception {
        Imovel imo1 = new Imovel(10, "Rua da Amargura, 503", 250000);
        Novo nov1 = new Novo(18, "Travessa da Solidão", 300000, 5000);
        Usado usa1 = new Usado(16, "Avenida da Angústia", 500000, 20);

        System.out.println("Preço do Imóvel 1:  " + imo1.precoFinal());
        System.out.println("Preço do Imóvel 2:  " + nov1.precoFinal());
        System.out.println("Preço do Imóvel 3:  " + usa1.precoFinal());
    }
}