/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class Professor {
    String nome;
    String materia;
    int datadenascimento;
    float salario;
    int totalaulas;
    
    void atribuidor (Scanner input) {
        System.out.println("------------------------Inserção de professor----------------------");

        System.out.print("Insira o nome do professor:  ");
        nome = input.nextLine();
        System.out.print("Insira a matéria do professor:  ");
        materia = input.nextLine();
        System.out.print("Insira a data de nascimento do professor:  ");
        datadenascimento = input.nextInt();
        System.out.print("Insira o salário do professor:  ");
        salario = input.nextFloat();
        System.out.print("Insira o número total de aulas do professor:  ");
        totalaulas = input.nextInt();
    }   
    
    void print () {
        System.out.println("-----------------------Informações do professor-----------------------");
        System.out.println("Matéria do professor:  " + materia);
        System.out.println("Data de nascimento do professor:  " + datadenascimento);
        System.out.printf("Salário do professor:  %.2f\n", salario);
        System.out.println("Total de aulas do professor:  " + totalaulas);
    }
}
