import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Boas-vindas! ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite seu peso: ");
        float peso = scanner.nextFloat();

        scanner.nextLine();

        System.out.print("Digite sua altura: ");
        float altura = scanner.nextFloat();

        scanner.nextLine();

        System.out.print("Digite seu estado civil: ");
        String estadoCivil = scanner.nextLine();

        scanner.close();

        System.out.println("Olá, " + nome + "! Seu CPF é " + cpf + "! Seu peso é " + peso + "! Sua altura é " + altura + "! Seu estado civil é " + estadoCivil + "!");
    }
}