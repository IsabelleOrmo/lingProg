public class Ingresso {
    private int valor;
    private static int qntdIngresso=0;
        
    
    //contrutores de classe
    public Ingresso(int valor) {
        this.valor = valor;
        qntdIngresso++;
    }

    public Ingresso() {
        valor = 600;
        qntdIngresso++;
    }

    //get e set 
    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    //métodos

    public void imprimeValor() {
        System.out.println("O preço do ingresso é:  " + getValor());
    }

}
