public class Caneta {
    private int numero;
    private String cor;
    private String marca;
    private float preco;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Caneta (int n, String c, String m, float p) {
        cor = c;
        numero = n;
        marca = m;

        if (p > 0) {
            preco = p;
        }

        if (p <= 0) {
            preco = 0.7f;
            System.out.println("ERRO:  Número inválido. O número padrão será atribuido. ");
        }
    }

}
