public class VIP extends Ingresso {
    private static int valorAdicional = 100;

    //construtores 
    public VIP(int valor) {
        super(valor);
    }

    public VIP() {
        super();
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

    /*
    @Override
    public void imprimeValor() {
        System.out.println("O preço do ingresso é:  " + getValor());
    } 
    */  

}
