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
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno(); 
        Disciplina disc1 = new Disciplina(); 
        Professor prof1 = new Professor();
        Scanner input = new Scanner(System.in);
        
        aluno1.atribuidor(input);
        aluno2.atribuidor(input);
        disc1.atribuidor(input);
        prof1.atribuidor(input);
        
        aluno1.print();
        aluno2.print();
        disc1.print();
        prof1.print();
    }
    
}
