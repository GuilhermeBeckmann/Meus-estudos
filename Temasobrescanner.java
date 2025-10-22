import java.util.Scanner;

public class Temasobrescanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo, digite o seu nome completo por favor:");
        String nomecompleto = scanner.nextLine();

        System.out.println("Digite o seu cpf:");
        String cpf = scanner.nextLine();

         System.out.println("Digite o seu peso:");
        int peso = scanner.nextInt();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura:");
        double altura = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("E agora digite o seu estado civíl:");
                String estadocivil = scanner.nextLine();


        System.out.println("Muito obrigado!");

    }
}