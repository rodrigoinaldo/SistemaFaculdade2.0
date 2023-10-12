package org.faculdade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        cadastroFaculdade(funcionarios);

        funcionarios.forEach(Funcionario::imprimir);
    }

    private static void cadastroFaculdade(List<Funcionario> funcionarios) {
        var scaner = new Scanner(System.in);

        do {
            System.out.println("""
                    Novo cadastro
                    1- docente
                    2 - assistentes
                    3 - coodernador
                    4- tecinico""");

            var resposta = scaner.nextLine();

            if (resposta.equals("1") ){
                funcionarios.add(Docente.construtor());
            }

            if (resposta.equals("2") ){
                funcionarios.add(Assistente.mais());
            }

            if (resposta.equals("3") ){
                funcionarios.add(Coodernador.novoCood());
            }

            if (resposta.equals("4") ){
                funcionarios.add(Tecnico.construir());
            }


            System.out.println("0 - continuar");

        } while (scaner.nextLine().equals("0")) ;
    }



}