package org.faculdade;

import java.util.Scanner;

public class Coodernador extends Funcionario{

    private String curso;
    private String turma;


    @Override
    public String  toString() {
        return "Coodernador{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }

    public void dadosCoodernador(){
        System.out.println(nome+" "+curso+" "+turma);
    }

    public static Coodernador novoCood(){
        Coodernador coodernador = new Coodernador();
        Scanner scanner = new Scanner(System.in);

        System.out.println("qual o nome ");
        coodernador.nome = scanner.next();

        System.out.println("em qual curso");
        coodernador.curso = scanner.next();

        System.out.println("em qual turma");
        coodernador.turma = scanner.next();

        return coodernador;
    }
}
