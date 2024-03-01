package br.com.estevao.modelo;

public class Ficha {
    private Lutadores lutadores;
    private int forca;
    private int agilidade;
    private int energia;

    public Ficha(Lutadores lutadores, int forca, int agilidade, int energia){
        this.lutadores = lutadores;
        this.forca = forca;
        this.agilidade = agilidade;
        this.energia = energia;
    }

    public void setLutadores(Lutadores lutadores){
        this.lutadores = lutadores;
    }
    public Lutadores getLutadores(){
        return lutadores;
    }
    public void setForca(int forca){
        this.forca = forca;
    }
    public int getForca(){
        return forca;
    }
    public void setAgilidade(int agilidade){
        this.agilidade = agilidade;
    }
    public int getAgilidade(){
        return agilidade;
    }
    public void setEnergia(int energia){
        this.energia = energia;
    }
    public int getEnergia(){
        return energia;
    }
}
