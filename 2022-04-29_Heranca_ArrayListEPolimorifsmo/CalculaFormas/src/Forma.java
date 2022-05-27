public class Forma {
    // Declaração de variáveis
    private float lado;

    // Construtores da classe
    public Forma(float lado) {
        this.lado = lado;
    }
    public Forma() {
        lado = 1;
    }

    // Métodos da classe
     public float getLado() {
        return this.lado;
    }

    public void setLado(float lado) {
        this.lado = verify(lado);
    }

    protected float verify(float lado) {
        if (lado < 0) {
            lado *= -1; 
        }
        return lado; 
    }
}
