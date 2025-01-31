package br.com.imposto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner sc = new Scanner(System.in)) {
            // Leitura dos dados do usuário
            System.out.print("Renda anual com salário: ");
            double rendaSalario = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            double rendaServicos = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double rendaCapital = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            double gastosMedicos = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            double gastosEducacionais = sc.nextDouble();

            // Criação da instância de Pessoa e cálculo do imposto
            Pessoa pessoa = new Pessoa(rendaSalario, rendaServicos, rendaCapital, gastosMedicos, gastosEducacionais);
            Imposto imposto = new Imposto();
            Deducoes deducoes = new Deducoes();

            double impostoBruto = imposto.calcularImpostoBruto(pessoa);
            double gastosDedutiveis = deducoes.calcularDeducoes(pessoa, impostoBruto);
            double impostoDevido = impostoBruto - gastosDedutiveis;

            // Relatório final
            System.out.println("### RELATÓRIO DE IMPOSTO DE RENDA ###");
            System.out.printf("Imposto devido: %.2f%n", impostoDevido);
        }
    }
}
