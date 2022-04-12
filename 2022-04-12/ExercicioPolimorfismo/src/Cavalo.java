import javax.rmi.CORBA.Stub;

public class Cavalo extends Animal{
    
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public Cavalo() {
        super();
    }

    @Override
    public void emitirSom() {
        System.out.println("*BUUUF*");
    }

    @Override
    public void deveAcao() {
        System.out.println("Este animal corre");
    }
}
