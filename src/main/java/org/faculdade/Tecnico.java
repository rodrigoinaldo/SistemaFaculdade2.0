package org.faculdade;

import java.util.Scanner;

public class Tecnico extends Funcionario {


    private String departamento;
    private String especialidade;

    @Override
    public String toString() {
        return "Tecnico{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }

    public  void  imprimir(){
        System.out.print(this);
    }

    public static Tecnico construir(){
        var tecnico = new  Tecnico();
        var scaner = new Scanner(System.in);

        System.out.println("nome");
        tecnico.nome = scaner.nextLine();
        System.out.println("departamento");
        tecnico.departamento = scaner.nextLine();
        System.out.println("especialidade");
        tecnico.especialidade = scaner.nextLine();

        return  tecnico;
    }
}
