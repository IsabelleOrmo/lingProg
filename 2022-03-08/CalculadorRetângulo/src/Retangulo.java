public class Retangulo {
    private int base;
    private int altura;

    public Retangulo (int base, int altura) {
        this.base = verifica(base);
        this.altura = verifica(altura);
    }

    public Retangulo () {
        this.base = 1;
        this.altura = 1;
    }

    public int perimetro() {
        return ((altura * 2) + (base * 2));
    }

    public int area() {
        return altura * base;
    }

    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = verifica(base);
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = verifica(altura);
    }
    
    public int verifica(int valor) {
        if (valor >= 1 && valor <= 20) {
            return valor;
        } else {
            System.out.println("Valor inválido!");
            return 1;
        }
    }
}
