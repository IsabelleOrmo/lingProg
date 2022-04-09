public class Cirurgiao extends Medico {
    public Cirurgiao() {
        super(); 
    }

    public Cirurgiao(boolean trabalhaNoHospital) {
        super(trabalhaNoHospital);
    }

    private void fazerIncisao() {
        System.out.println("Incisão de 3cm na vertical, por favor.");
    }

    @Override
    public void tratarPaciente() {
        // TODO Auto-generated method stub
        super.tratarPaciente();
        System.out.print("A cirurgia será amanhã de manhã.");
        fazerIncisao();
        System.out.println("Cirurgia realizada com sucesso.");
    }
}
