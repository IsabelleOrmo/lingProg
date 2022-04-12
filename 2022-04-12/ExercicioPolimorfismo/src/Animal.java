import javax.sound.sampled.SourceDataLine;

public class Animal {
    private String nome;
    private int idade;

    public Animal (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Animal (){
        nome = "";
        idade = 0;
    }

    public void emitirSom(){
        System.out.println("Este animal não emite som.");
    }

    public void deveAcao(){
        System.out.println("Esse animal não se movimenta.");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
