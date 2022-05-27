public class FormaBidimensional extends Forma {
    // Construtores da classe
    protected FormaBidimensional(float lado) {super(lado);}
    protected FormaBidimensional() {super();}
    
    // Métodos da classe
    public float obterArea() {
        return getLado(); 
    }

    public static float obterArea(int lado) {
        return lado;
    }
}
