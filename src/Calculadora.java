import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    // Laço 1: nome
    while (true) {
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();

        if (nome.isBlank()) {
            System.out.println("Você não escreveu nada, digite o nome aí");
        } else {
            System.out.println("Bem vindo " + nome + "!");
            break;
        }
    }

    // Laço 2: calculadora
    while (true) {
        float resultado = 0;

        System.out.println("Digite a operação (soma, subtracao, multiplicacao, divisao):");
        String operacao = scanner.nextLine();

        System.out.println("Digite o valor 1");
        float num1 = Float.parseFloat(scanner.nextLine());

        System.out.println("Digite o valor 2");
        float num2 = Float.parseFloat(scanner.nextLine());

        if (operacao.equalsIgnoreCase("soma")) {
            resultado = num1 + num2;
        } else if (operacao.equalsIgnoreCase("subtracao")) {
            resultado = num1 - num2;
        } else if (operacao.equalsIgnoreCase("multiplicacao")) {
            resultado = num1 * num2;
        } else if (operacao.equalsIgnoreCase("divisao")) {
            resultado = num1 / num2;
        } else {
            System.out.println("Operação inválida! Digite novamente");
            continue;
        }

        System.out.println("O valor da " + operacao + " é: " + resultado);

        System.out.println("Deseja continuar? (sim/não)");
        String continuar = scanner.nextLine();

        if (!continuar.equalsIgnoreCase("sim")) {
            break;
        }
    }
}