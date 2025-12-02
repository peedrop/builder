package org;

public class CarroBuilder {
    private Carro carro;

    public CarroBuilder() {
        carro = new Carro();
    }

    public Carro build() {
        if (carro.getMarca().equals("")) {
            throw new IllegalArgumentException("Marca inválida");
        }
        if (carro.getModelo().equals("")) {
            throw new IllegalArgumentException("Modelo inválida");
        }

        return carro;
    }

    public CarroBuilder setMarca(String marca) {
        carro.setMarca(marca);
        return this;
    }
    public CarroBuilder setModelo(String modelo) {
        carro.setModelo(modelo);
        return this;
    }
    public CarroBuilder setAnoDeFabricacao(String anoDeFabricacao) {
        carro.setAnoDeFabricacao(anoDeFabricacao);
        return this;
    }
    public CarroBuilder setCor(String cor) {
        carro.setCor(cor);
        return this;
    }
    public CarroBuilder setNumPortass(int numPortass) {
        carro.setNumPortass(numPortass);
        return this;
    }
    public CarroBuilder setVelocidadeMax(int velocidadeMax) {
        carro.setVelocidadeMax(velocidadeMax);
        return this;
    }
}