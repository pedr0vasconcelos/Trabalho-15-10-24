package br.com.imposto;

public class Deducoes {
    public double calcularDeducoes(Pessoa pessoa, double impostoBruto) {
        double maxDedutivel = impostoBruto * 0.30;
        double gastosDedutiveis = Math.min(pessoa.getGastosMedicos() + pessoa.getGastosEducacionais(), maxDedutivel);
        return gastosDedutiveis;
    }
}
