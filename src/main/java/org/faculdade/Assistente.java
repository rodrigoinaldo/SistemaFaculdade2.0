package org.faculdade;

import java.util.Scanner;

public class Assistente extends Funcionario{

    private String setor;
    private String atribucao;

    @Override
    public String toString() {
        return "Assistente{" +
                "nome='" + nome + '\'' +
                ", setor='" + setor + '\'' +
                ", atribucao='" + atribucao + '\'' +
                '}';
    }

    public void  dados(){
        System.out.println(this);
    }

    public static Assistente mais(){
        var assistente = new Assistente();

        var scanner = new Scanner(System.in);
        System.out.println("qual o nome");
        assistente.nome= scanner.nextLine();

        System.out.println("em qual setor trabalha");
        assistente.setor= scanner.nextLine();

        System.out.println("qual a atribução");
        assistente.atribucao = scanner.nextLine();

        return assistente;
    }
}
