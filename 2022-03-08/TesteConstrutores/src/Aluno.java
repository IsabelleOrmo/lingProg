public class Aluno {
    private int ra;
    private String name;

    public int getRa() {
        return this.ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Aluno (int ra, String name) {
        this.ra = ra;
        this.name = name;
    }

    public void verifica(String name) {
        if (name.equals("")) {
            System.out.println("Erro");
        } else {
            this.name = name;
        }
    }
    
    public void verifica(int ra) {
        if (ra < 0) {
            System.out.println("ERRO!");
        } else {
            this.ra = ra;
        }
    }
}
