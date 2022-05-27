public class Imovel {
    private int codigo;
    private String endereco;
    private float preco;
    
    public Imovel() {
        codigo = 0;
        endereco = ""; 
        preco = 0;
    }
    
    public Imovel(int codigo, String endereco, float preco) {
        this.codigo = verifyInt(codigo);
        this.endereco = endereco; 
        this.preco = verifyFloat(preco);
    }

    public float precoFinal() {
        return preco;
    }

    protected float precoFinal(float difValue) {
        return preco + difValue;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = verifyInt(codigo);
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = verifyFloat(preco);
    }

    protected float verifyFloat(float number) {
        if (number < 0)
            return 0;
        else return number; 
    }

    protected int verifyInt(int codigo) {
        if (codigo < 0)
            return 0;
        else return codigo;  
    }
}
