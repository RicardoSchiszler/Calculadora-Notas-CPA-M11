package com.ricardoschiszler.calculadoraCPA;
import java.util.Scanner;

public class Disciplina {

    String nomeDisciplina;
    double nota01 = 0.0;
    double nota02 = 0.0;
    Scanner input = new Scanner(System.in); // entrada de dados.

    // construtor recebendo o nome da Disciplina.
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    // método para preencher disciplinas que possuam apenas uma prova.
    public void preencherNotas(double nota01){
        System.out.println("Nota atual: " + this.nota01);
        System.out.print("Digite a nova nota: ");
        this.nota01 = input.nextDouble();

    }
    // método para preencher disciplinas que possuam duas provas.
    public void preencherNotas(double nota01, double nota02){
        System.out.println("Nota P1 atual:" + this.nota01);
        System.out.println("Deseja alterar[s/n]? ");
        String op = input.nextLine();
        if(op.equalsIgnoreCase("s")){ // verifica se o usuário deseja alterar a nota da P1
            System.out.print("Digite a nova nota para P1: ");
            this.nota01 = input.nextDouble();
        }
        System.out.println("Nota P2 atual:" + this.nota02);
        System.out.print("Deseja alterar[s/n]? ");
        op = input.next();
        if(op.equalsIgnoreCase("s")){ //verifica se o usuário deseja alterar a nota da P2
            System.out.print("Digite a nova nota para P2: ");
            this.nota02 = input.nextDouble();
        }
    }
}
