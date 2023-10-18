package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Circulo;
import br.senai.sp.jandira.model.Retangulo;

import java.util.Scanner;

public class GerenciadorFormas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();

        boolean continuar = true;

        while (continuar) {

            System.out.println("---------------------");
            System.out.println("Gerenciador de Formas");
            System.out.println("---------------------");
            System.out.println("");
            System.out.println("[1- Retângulo]");
            System.out.println("[2- Círculo]");
            System.out.println("[3- Sair]");
            int resposta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("");

            switch (resposta) {

                case 1:
                    System.out.print("Informe a largura do retângulo em centrímetros: ");
                    retangulo.setL2(scanner.nextDouble());
                    scanner.nextLine();

                    System.out.print("Informe a altura do retângulo em centrímetros: ");
                    retangulo.setL1(scanner.nextDouble());
                    scanner.nextLine();

                    retangulo.calcularArea();
                    retangulo.calcularPerimetro();

                    System.out.printf("A área do retângulo é: %.2f %n", retangulo.getArea(), " cm");
                    System.out.printf("O perímetro do retângulo é: %.2f %n", retangulo.getPerimetro(), " cm");
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Informe o diâmetro do circulo em centrímetros: ");
                    circulo.setDiametro(scanner.nextDouble());
                    scanner.nextLine();

                    circulo.calcularArea();
                    circulo.calcularPerimetro();

                    System.out.printf("A área do círculo é: %.2f %n", circulo.getArea(), " cm");
                    System.out.printf("O perímetro do círculo é: %.2f %n", circulo.getPerimetro(), " cm");
                    System.out.println("");
                    break;

                case 3:
                    continuar = false;
                    break;
            }

        }

    }

}
