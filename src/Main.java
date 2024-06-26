import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da agência!");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha pendente

        System.out.println("Por favor, digite a agência!");
        String agencia = scanner.next();
        scanner.nextLine(); // Consome a nova linha pendente

        System.out.println("Por favor, digite seu nome!");
        String nome = scanner.nextLine(); // Lê a linha inteira

        System.out.println("Por favor, digite o saldo!");
        float saldo = scanner.nextFloat();

        System.err.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o seu saldo " + saldo + " já está disponível para saque. ");
        scanner.close();
    }
}

