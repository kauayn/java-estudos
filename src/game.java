import java.util.Random;
import java.util.Scanner;

void main () {
// Sorteio de 1 a 100:
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int segredo = random.nextInt(100) + 1;

    String VERMELHO = "\u001B[31m";
    String VERDE = "\u001B[32m";
    String RESET = "\u001B[0m";

    System.out.println("Bem vindo ao jogo do número secreto!");

    while (true) {
        System.out.print("Digite um numero de 1 a 100: ");
        int palpite = sc.nextInt();

        if (palpite < segredo) {
            System.out.println("Muito baixo!");
            continue;
        } else if (palpite > segredo) {
            System.out.println("Muito Alto!");
            continue;
        } else {
            System.out.println(VERDE + "ACERTOUUUUU! " + RESET + " Seu palpite: " + palpite + " Numero aleatório: " + segredo);

            String jogardnv = sc.nextLine();
            System.out.println("Deseja jogar novamente?  (" + VERDE + " S " + RESET + ") (" + VERMELHO + " N " + RESET + ")");

            if (jogardnv.equals("S")) {
                continue;
            } else {
                System.out.print("Fim de jogo!");
            }

            break;
        }
    }
}
