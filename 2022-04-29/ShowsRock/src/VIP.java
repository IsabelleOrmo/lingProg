public class VIP extends Ingresso {
    private static int valorAdicional = 100;
    private static int qntdVIP = 0;

    //construtores 
    public VIP(int valor) {
        super(valor);
        qntdVIP++;
    }

    public VIP() {
        super();
        qntdVIP++;
    }   
    
    //get set 
    @Override
    public int getValor() {
        return super.getValor() + valorAdicional;
    }

    public static int getValorAdicional() {
        return valorAdicional;
    }

    public static void setValorAdicional(int valorAdicional) {
        VIP.valorAdicional = valorAdicional;
    }

    public static int getQntdVIP() {
        return qntdVIP; 
    }

    @Override
    public void imprimeValor() {
        System.out.println("O preço do ingresso VIP é:  " + (getValor() + valorAdicional));
    } 
}