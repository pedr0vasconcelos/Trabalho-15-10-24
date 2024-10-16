package br.com.imposto;

public class Imposto {
    public double calcularImpostoBruto(Pessoa pessoa) {
        double impostoSalario = calcularImpostoSalario(pessoa.getRendaSalario() / 12);
        double impostoServicos = pessoa.getRendaServicos() * 0.15;
        double impostoCapital = pessoa.getRendaCapital() * 0.20;
        return impostoSalario + impostoServicos + impostoCapital;
    }

    private double calcularImpostoSalario(double salarioMensal) {
        if (salarioMensal < 3000) {
            return 0;
        } else if (salarioMensal < 5000) {
            return salarioMensal * 12 * 0.10;
        } else {
            return salarioMensal * 12 * 0.20;
        }
    }
}
