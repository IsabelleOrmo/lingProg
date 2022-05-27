public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public Cachorro() {
        super();
    }

    @Override
    public void emitirSom() {
        System.out.println("AUAU");
    }

    @Override
    public void deveAcao() {
        System.out.println("Este animal corre");
    }
}
