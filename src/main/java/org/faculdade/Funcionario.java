package org.faculdade;
// esta armazenando algo mais geral
public class Funcionario { // esta servindo como classe pai de outras classes para armazenar o nome

    private String formacao;
    protected String nome;

    public void imprimir(){
        System.out.println(this);
    }
}
