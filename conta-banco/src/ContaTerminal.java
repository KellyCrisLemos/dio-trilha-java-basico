import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     */

     public static void main(String[] args) {
        System.out.println("Olá!");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("MARIO ANDRADE");
            String nome = scanner.nextLine();

            System.out.print("1021");
            int ContaCorrente = scanner.nextInt();

            System.out.print("067");
            int agencia = scanner.nextInt();

            System.out.print("237,48");
            int saldo = scanner.nextInt();

            System.out.println("Olá" + nome + "obrigado por criar uma conta em nosso banco, sua agência é" + agencia + "conta" + ContaCorrente + "e seu saldo" + saldo + "já está disponível para saque.");
        }
    }
        
    
}
