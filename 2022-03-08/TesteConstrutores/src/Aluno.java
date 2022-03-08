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

}
