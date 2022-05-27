public class Medico {
    private boolean trabalhaNoHospital;

    public Medico() {
        trabalhaNoHospital = false;
    }

    public Medico(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public void tratarPaciente() {
        if (trabalhaNoHospital)
            System.out.println("É virose.");
        else System.out.println("Não está trabalhando. Impossível tratar.");
    }

    public boolean doesTrabalhaNoHospital() {
        return this.trabalhaNoHospital;
    }

    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }
}
