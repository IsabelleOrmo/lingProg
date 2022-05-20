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
                throw new IllegalArgumentException("O RA deve ser positivo.");
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            ra = 0;
        } catch(RuntimeException e) {
            System.out.println("Sabe lá deus que erro foi esse");
        } finally {
            this.ra = ra;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()) {
            throw new EmptyStringException();
        } else {
            this.nome = nome;
        }
    }
    
}
