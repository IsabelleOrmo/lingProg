public class Aluno {
    // Atributos da classe
    private int ra;
    private String nome;

    // Getters e setters
    public int getRa() {
        return this.ra;
    }

    public void setRa(int ra) {
        try {
            if (ra < 0)
                throw new IllegalArgumentException();
        } catch(IllegalArgumentException e) {
            System.out.println("O RA deve ser positivo.");
            ra = 0;
        } finally {
            this.ra = ra;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
