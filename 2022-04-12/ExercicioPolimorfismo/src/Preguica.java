public class Preguica extends Animal{
    
    public Preguica (String nome, int idade){
        super(nome, idade);
    }

    public Preguica() {
        super();
    }

    @Override
    public void emitirSom() {
        System.out.println("----");
    }

    @Override
    public void deveAcao() {
        System.out.println("Este animal sobe em arvores.");
    }
}
