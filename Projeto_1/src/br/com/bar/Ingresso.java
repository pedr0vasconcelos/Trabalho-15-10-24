package br.com.bar;

public class Ingresso {
    private Cliente cliente;

    public Ingresso(Cliente cliente) {
        this.cliente = cliente;
    }

    public double calcularIngresso() {
        return (cliente.getSexo() == 'M' || cliente.getSexo() == 'm') ? 10 : 8;
    }
}
