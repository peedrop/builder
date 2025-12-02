package org;

public class Carro {
    private String marca;
    private String modelo;
    private String anoDeFabricacao;
    private String cor;
    private int numPortass;
    private int velocidadeMax;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(String anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumPortass() {
        return numPortass;
    }

    public void setNumPortass(int numPortass) {
        this.numPortass = numPortass;
    }

    public int getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(int velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public Carro () {
        this.marca="";
        this.modelo="";
    }
}