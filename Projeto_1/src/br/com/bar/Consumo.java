package br.com.bar;

public class Consumo {
    private int cervejas;
    private int refrigerantes;
    private int espetinhos;

    public Consumo(int cervejas, int refrigerantes, int espetinhos) {
        this.cervejas = cervejas;
        this.refrigerantes = refrigerantes;
        this.espetinhos = espetinhos;
    }

    public double calcularConsumo() {
        return (cervejas * 5) + (refrigerantes * 3) + (espetinhos * 7);
    }

    public double calcularCouvert(double consumo) {
        return (consumo > 30) ? 0 : 4;
    }
}
