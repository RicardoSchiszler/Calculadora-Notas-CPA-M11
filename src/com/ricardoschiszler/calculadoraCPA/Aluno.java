package com.ricardoschiszler.calculadoraCPA;

import java.util.Scanner;

public class Aluno {
    Scanner input = new Scanner(System.in); // entrada de dados
    String nome;
    String pelotao;

    // criação de objetos a partir de construtores que recebem o nome da Disciplina.
    Disciplina tiro = new Disciplina("Tiro");
    Disciplina pop = new Disciplina("POP");
    Disciplina educacaoFisica = new Disciplina("Educacao Fisica");

    //método para cadastrar aluno
    public void preencherAluno(){

        System.out.print("Nome: ");
        this.nome = input.nextLine();
        System.out.print("Pelotão: ");
        this.pelotao = input.nextLine();
    }
    // método para exibir notas com base na quantidade de provas de cada Disciplina. Recebe a disciplina e a quantidade de provas.
    public void exibeNotas(Disciplina disciplina, int quantidadeProvas){
        System.out.println("=======================================");
        System.out.println("Notas da disciplina " + disciplina.nomeDisciplina +": ");
        if(quantidadeProvas == 1){
            System.out.println("Nota P1: " + disciplina.nota01);
            System.out.println();
        }
        else if(quantidadeProvas == 2){
            System.out.println("Nota P1: " + disciplina.nota01);
            System.out.println("Nota P2: " + disciplina.nota02);
            System.out.println();
        }
        else{
            System.out.println("ERRO");
        }

    }
    // método MenuPrincipal
    public void menu() {
        int opcao;

        System.out.println("========================");
        System.out.println("OLÁ, " + this.nome.toUpperCase() + " DO " + this.pelotao.toUpperCase() + "!");
        System.out.println("========================");
        System.out.println("1. Exibir Notas");
        System.out.println("2. Alterar Notas");
        System.out.println("3. Média do Curso");
        System.out.println("===================");
        System.out.print("Digite o número de uma opção: ");
        opcao = input.nextInt();
        System.out.println();

        // Verifica qual opção o Aluno escolheu e executa o código correspondente.
        switch (opcao) {
            default:
                while (opcao < 1 || opcao > 3) {
                    System.out.print("Insira uma opção válida[1, 2 ou 3]: ");
                    opcao = input.nextInt();
                }
            case 1:
                exibeNotas(tiro, 2); // utiliza o método para exibir todas as notas de cada uma das disciplina
                exibeNotas(educacaoFisica, 1);
                exibeNotas(pop, 1);
                System.out.print("Digite qualquer coisa para retornar: ");
                String pausa = input.next(); // aguarda até que o Aluno termine de verificar as notas e opte por continuar
                this.menu(); // retorna para o Menu Principal
                break;
            case 2:
                alterarNotas(); // chama o método para alterar Notas
                this.menu(); // retorna para o Menu Principal
                break;
            case 3:
                double resultado = (this.educacaoFisica.nota01 + this.tiro.nota01 + this.tiro.nota02 + this.pop.nota01) / 4;
                System.out.println("Atualmente, a sua média do Especifico é: " + resultado);
                break;
        }
    }
    public void alterarNotas(){
        int opcao;
        System.out.println("1. TIRO");
        System.out.println("2. POP");
        System.out.println("3. EDUCAÇÃO FISICA");
        opcao = input.nextInt();


        switch(opcao){
            case 1:
                tiro.preencherNotas(tiro.nota01, tiro.nota02);
                break;
            case 2:
                pop.preencherNotas(pop.nota01);
                break;
            case 3:
                educacaoFisica.preencherNotas(educacaoFisica.nota01);
                break;
        }
    }

}
