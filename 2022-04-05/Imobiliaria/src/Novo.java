public class Novo extends Imovel {
    private float newPreco;

    public Novo() {
        super();
    }

    public Novo(int codigo, String endereco, float preco, float newPreco) {
        super(codigo, endereco, preco);
        this.newPreco = verifyFloat(newPreco);
    }

    @Override
    public float precoFinal() {
        return super.precoFinal(newPreco);
    }

    public float getNewPreco() {
        return this.newPreco;
    }

    public void setNewPreco(float newPreco) {
        this.newPreco = newPreco;
    }
}
