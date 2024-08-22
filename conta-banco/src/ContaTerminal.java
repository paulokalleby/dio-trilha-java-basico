import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome do cliente:");
        String nome = scanner.nextLine();
        
        System.out.println("Informe o numero da conta:");
        int conta = scanner.nextInt();

        System.out.println("Informe a agencia:");
        String agencia = scanner.next();

        System.out.println("Informe o saldo:");
        double saldo = scanner.nextDouble();

        System.out.printf(
            "Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque.",
            nome,
            agencia,
            conta,
            saldo
        );

        scanner.close();
    }
}
