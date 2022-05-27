public class Poupanca {
    static float taxaJurosAnual = 0.03f;
    private float saldo;

    public Poupanca () {
        saldo = 0;
    }

    public Poupanca (float saldo){
        this.saldo = saldo;
    }

    static float getTaxaJuros() {
        return taxaJurosAnual;
    }

    public float getJurosMensais(){
        return (saldo*taxaJurosAnual)/12;
    }

    static void setTaxaJuros(float taxa){
        taxaJurosAnual = taxa/100;
    }
    
    public void calcularJurosMensais(){
        this.saldo += getJurosMensais();
    }



    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
