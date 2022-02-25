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
public class Disciplina {
    String docente;
    String nome;
    String departamento;
    float cargahoraria; 
    
    void atribuidor(Scanner input) {
        System.out.println("--------------------Inserção da disciplina-----------------------");
        
        System.out.print("Insira o nome do professor:  ");
        docente = input.nextLine();
        System.out.print("Insira o nome da disciplina:  ");
        nome = input.nextLine();
        System.out.print("Insira o departamento:  ");
        departamento = input.nextLine();
        System.out.print("Defina a carga horaria:  ");
        cargahoraria = input.nextFloat();
    }
    
    void print() {
        System.out.println("-------------------Informações da disciplina----------------------");
        System.out.println("Nome da disciplina:  " + nome);
        System.out.println("Professor responsável:  " + docente);
        System.out.println("Departamento da disciplina:  " + departamento);
        System.out.println("Carga horária da discplina:  " + cargahoraria);
    }
}
