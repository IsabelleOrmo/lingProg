public class ClinicoGeral extends Medico {
    private boolean atendeEmCasa;

    public ClinicoGeral() {
        super();
        atendeEmCasa = false; 
    }

    public ClinicoGeral(boolean trabalhaNoHospital, boolean atendeEmCasa) {
        super(trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public String receita() {
        return "قرص أموكسيلين 50mg" + " 4 vezes ao dia";
    }

    public boolean doesAtendeEmCasa() {
        return this.atendeEmCasa;
    }

    public void setAtendeEmCasa(boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    } 

}
