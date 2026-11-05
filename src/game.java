import java.util.Random;
import java.util.Scanner;

void main () {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    String VERMELHO = "\u001B[31m";
    String VERDE = "\u001B[32m";
    String RESET = "\u001B[0m";
    boolean jogarnovamente = true;

    System.out.println("Bem vindo ao jogo do número secreto!");

    while (jogarnovamente) {
        int segredo = random.nextInt(100) + 1;
        int tentativas = 0;
        int maxTentativas = 5;
        boolean acertou = false;

        while (tentativas < maxTentativas) {

            System.out.print("Digite um numero de 1 a 100: ");
            int palpite = sc.nextInt();

            tentativas++;

            if (palpite < segredo) {
                System.out.println("Muito baixo! Ainda restam " + (maxTentativas - tentativas) + " tentativas");

            } else if (palpite > segredo) {
                System.out.println("Muito alto! Ainda restam " + (maxTentativas - tentativas) + " tentativas");

            } else {
                acertou = true;
                break;
            }
        }

        if (acertou) {
            System.out.println(VERDE + "ACERTOUUUUU! " + RESET + "Você acertou em " + tentativas + " tentativa(s)! Número secreto: " + segredo);
        } else {
            System.out.println(VERMELHO + "Você perdeu!" + RESET + " O número era " + segredo);
        }

        System.out.println("Deseja jogar novamente?  (" + VERDE + " S " + RESET + ") (" + VERMELHO + " N " + RESET + ")");
        String jogardnv = sc.next();

        if (!jogardnv.equalsIgnoreCase("S")) {
            System.out.println("Fim de jogo!");
            jogarnovamente = false;
        }
    }
}