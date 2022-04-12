public class App {
    public static void main(String[] args) throws Exception {
        Animal cachorro = new Cachorro("Calma", 90);
        Animal cavalo = new Cavalo("Puxão", 19);
        Animal preguica = new Preguica("Alessandra", 18);

        cachorro.emitirSom();
        cavalo.emitirSom();
        preguica.emitirSom();
    }
}
