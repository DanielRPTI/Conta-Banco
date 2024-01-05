import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO : obter a classe scanner 
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        //Exibir as mensagens para o nosso usuario e receber os dados no scanner
        System.out.println("Por favor, digite o número da Agência !");
        System.out.println("Usuário: ");
        int numero = sc.nextInt();
        System.out.println("Informe a agencia de seu banco: ");
        String agencia = sc.next();
        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.next();
        sc.nextLine();
        System.out.println("Informe o saldo da conta");
        double saldo = sc.nextDouble();
        //Exibir a mensagem com os dados 
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s , conta %d e seu saldo %.2f já está disponível para saque", nomeCliente,agencia,numero, saldo   );



    }
}
