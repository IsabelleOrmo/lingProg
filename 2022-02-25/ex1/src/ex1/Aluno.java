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
public class Aluno {
    String nome; 
    String curso;
    int idade;
    int ra;
    int anoInicio; 
    int anoFim;
    
    void conclusao () {
        anoFim = anoInicio+3;
        
    }    
    
    void atribuidor(Scanner input) {
        System.out.println("----------------------Inserção de aluno------------------------");

        System.out.print("Nome do aluno:  ");
        nome = input.nextLine();
        System.out.print("Insira o curso:  ");
        curso = input.nextLine();
        System.out.print("Idade do aluno:  ");
        idade = input.nextInt();
        System.out.print("RA:  ");
        ra = input.nextInt();
        System.out.print("Inicio do curso: ");
        anoInicio = input.nextInt();

        conclusao();
    }
    
    void print() {
        System.out.println("--------------------Informações do aluno-------------------");
        System.out.println("Nome do aluno:  " + nome);
        System.out.println("Curso do aluno:  " + curso);
        System.out.println("Idade do aluno:  " + idade);
        System.out.println("RA do aluno:  " + ra);
        System.out.println("Ano de início do curso:  " + anoInicio);
        System.out.println("Ano de finalização do curso:  " + anoFim);
    }
        
}
