
import java.util.Random;
import java.util.Scanner;

void main () {
// Sorteio de 1 a 100:
    Scanner sc = new Scanner(System.in);
    String VERMELHO = "\u001B[31m";
    String VERDE = "\u001B[32m";
    String RESET = "\u001B[0m";
    boolean jogarnovamente = true;

    System.out.println("Bem vindo ao jogo do número secreto!");

    while (jogarnovamente) {
        Random random = new Random();
        int segredo = random.nextInt(100) + 1;
        int tentativas = 0;
        int maxTentativas = 5;

        System.out.print(segredo);

        while (tentativas < 6) {

            System.out.print("Digite um numero de 1 a 100: ");
            int palpite = sc.nextInt();

            tentativas++;

            System.out.print(segredo);

            if (tentativas <= 0) {
                System.out.println("Você perdeu! o numero era " + segredo);
            }
            if (palpite < segredo) {
                System.out.println("Muito baixo! Ainda restam " + (maxTentativas - tentativas) + " Tentativas");

            } else if (palpite > segredo) {
                System.out.println("Muito alto! Ainda restam " + (maxTentativas - tentativas) + " Tentativas");

            } else {
                System.out.println(VERDE + "ACERTOUUUUU! " + RESET + " Seu palpite: " + palpite + " Numero aleatório: " + segredo);

                System.out.println("Deseja jogar novamente?  (" + VERDE + " S " + RESET + ") (" + VERMELHO + " N " + RESET + ")");
                String jogardnv = sc.next();

                if (jogardnv.equalsIgnoreCase("S")) {
                    jogarnovamente = true;
                } else {
                    System.out.print("Fim de jogo!");
                    jogarnovamente = false;
                }

                break;
            }
        }
    }
}
