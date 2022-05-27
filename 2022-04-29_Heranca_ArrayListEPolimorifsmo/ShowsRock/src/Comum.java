public class Comum extends Ingresso {
    private static int qntdComum = 0; 

    // Construtores da classe
    public Comum() {
        super(); 
        qntdComum++;
    }

    public Comum(int valor) {
        super(valor);
        qntdComum++;
    }


    // Getters
    public int getQntdComum() {
        return qntdComum; 
    }


    // Métodos
    @Override
    public void imprimeValor() {
        System.out.println("O preço do ingresso comum é:  " + getValor());
    }
}