package org.faculdade;

import java.util.Scanner;

public class Docente  extends Funcionario{ // pegando o nome do funcionario pois esta protegido


    private String formacao;
    private String cidade;


    @Override
    public String toString() {  // converte um obj para string
        return "Docentes{" +
                "nome='" + nome + '\'' +
                ", formacao='" + formacao + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }

    public void ImprimirDados(){
        System.out.println(this); // o this eesta apontando direto para o toString
    }

    public static Docente construtor(){
        var docente = new Docente();

        Scanner scanner = new Scanner(System.in);

        System.out.println("nome");
        docente.nome = scanner.nextLine();

        System.out.println("formação");
        docente.formacao = scanner.nextLine();

        System.out.println("cidade");
        docente.cidade = scanner.nextLine();

        return docente;
    }
}

