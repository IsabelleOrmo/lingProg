import java.util.ArrayList;

public abstract class Ingresso {
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

    public static int getQtndIngresso() {
        return qntdIngresso; 
    }


    //métodos
    public void imprimeValor() {
        System.out.println("O preço do ingresso é:  " + getValor());
    }

    public static float calculaValor(ArrayList<Ingresso> ingressos) {
        float valor = 0;
        for (Ingresso ingresso : ingressos) {
            valor += ingresso.getValor(); 
        }

        return valor;
    }

    public static void imprimeValores(ArrayList<Ingresso> ingressos) {
        for (Ingresso ingresso : ingressos) {
            if (ingresso instanceof Comum) {
                Comum ingressoComum = (Comum) ingresso;
                ingressoComum.imprimeValor();
            } else if (ingresso instanceof VIP) {
                VIP ingressoVIP = (VIP) ingresso;
                ingressoVIP.imprimeValor();
            } else {
                ingresso.imprimeValor();
            }
        }
    }
}