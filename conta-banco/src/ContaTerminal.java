import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
       
        double saldo = 237.48;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá digite o seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agência = scanner.next();

        System.out.println("Por favor, digite o número da conta!");
        int número = scanner.nextInt();

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá " +  nome + " "  + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é "   
        + agência +  ", conta "   + número + ", e seu saldo "   + saldo +  ", já está disponível para saque.");
        scanner.close();
}
}
