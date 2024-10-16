package br.com.bar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir que o Scanner seja fechado automaticamente
        try (Scanner sc = new Scanner(System.in)) {
            // Entrada de dados do cliente
            System.out.print("Sexo (F ou M): ");
            char sexo = sc.next().charAt(0);
            System.out.print("Quantidade de cervejas: ");
            int cervejas = sc.nextInt();
            System.out.print("Quantidade de refrigerantes: ");
            int refrigerantes = sc.nextInt();
            System.out.print("Quantidade de espetinhos: ");
            int espetinhos = sc.nextInt();

            // Instancia o cliente e realiza os cálculos
            Cliente cliente = new Cliente(sexo);
            Consumo consumo = new Consumo(cervejas, refrigerantes, espetinhos);
            Ingresso ingresso = new Ingresso(cliente);

            double totalConsumo = consumo.calcularConsumo();
            double couvert = consumo.calcularCouvert(totalConsumo);
            double valorIngresso = ingresso.calcularIngresso();
            double total = totalConsumo + couvert + valorIngresso;

            // Relatório final
            System.out.println("### RELATÓRIO ###");
            System.out.printf("Consumo = R$ %.2f%n", totalConsumo);
            if (couvert == 0) {
                System.out.println("Isento de Couvert");
            } else {
                System.out.printf("Couvert = R$ %.2f%n", couvert);
            }
            System.out.printf("Ingresso = R$ %.2f%n", valorIngresso);
            System.out.printf("Valor a pagar = R$ %.2f%n", total);
        }
    }
}
