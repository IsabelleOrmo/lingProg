public class App {
    public static void main(String[] args) throws Exception {
        Animal an1 = new Cachorro();
        an1.falar();

        Animal an2 = new Gato();
        an2.falar();

        Gato gato1 = (Gato) an2;
        gato1.vomitarTapete();

        Cachorro cach1 = (Cachorro) an1; 
        cach1.felicidade();
    }
}
