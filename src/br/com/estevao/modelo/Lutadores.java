package br.com.estevao.modelo;

public class Lutadores {
    private String nome;
    private String nacionalidade;

    public Lutadores(String nome , String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
