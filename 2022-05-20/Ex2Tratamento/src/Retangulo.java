import interfaces.Forma2D;

public class Retangulo extends FormaGeometrica implements Forma2D {
    // Argumentos da classe
    private double lado1;
    private double lado2;


    // Construtor
    public Retangulo(double lado1, double lado2) {
        setLado(lado1, lado2);

        
    }


    // Métodos da classe
    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public double calcularPerimetro() {
        return (lado1 * 2) + (lado2 * 2);
    }


    // Getters e setters
    public void setLado(double lado1, double lado2) {
        if (lado1 <= 0 || lado2 <= 0) {
            throw new IllegalArgumentException("Valor inválido, os valores esperados são maiores que 0 (zero)");
        } else if (lado1 == lado2) {
            throw new IllegalArgumentException("Valor inválido, modifique um dos valores a fim de torná-los diferentes");
        } else {
            this.lado1 = lado1;
            this.lado2 = lado2;
        }
    }

    public double getLado1() {
        return this.lado1;
    }

    public double getLado2() {
        return this.lado2;
    }    
}
