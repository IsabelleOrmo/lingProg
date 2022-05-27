public class App {
    public static void main(String[] args) throws Exception {
        Medico medico1 = new Medico(true); 
        ClinicoGeral clinico1 = new ClinicoGeral(true, false);
        Cirurgiao cirurgiao1 = new Cirurgiao(); 

        cirurgiao1.setTrabalhaNoHospital(true);

        System.out.println("Tratamento do médico:  ");
        medico1.tratarPaciente();

        System.out.println("\n\n\nTratamento do clínico:  ");
        clinico1.tratarPaciente();
        System.out.println("Receita do clínico geral:  " + clinico1.receita()); 

        System.out.println("\n\n\nTratamento cirúrgico:  "); 
        cirurgiao1.tratarPaciente();
    }
}
