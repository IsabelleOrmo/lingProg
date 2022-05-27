import interfaces.Forma2D;

public class Quadrado extends FormaGeometrica implements Forma2D {
    // Atributos da classe
    private double lado;


    // Construtores da classe
    public Quadrado(double lado) {
        this.lado = lado;

        setPerimetro(calcularPerimetro());
        setArea(calcularArea());
    }

    
    // Métodos da interface    
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    
    // Getters e setters
    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
