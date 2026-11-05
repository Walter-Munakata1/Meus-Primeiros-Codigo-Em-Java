import java.util.Scanner;

public class portaria
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Agora informe sua idade: : ");
        int idade = scanner.nextInt();

        System.out.println("Voce possui uma credencial vip: ");
        System.out.println("1- sim");
        System.out.println("2- nao");
        int credencial = scanner.nextInt();

        if(credencial == 1 || idade >= 18)
        {
            System.out.println("Acesso permitido com acesso a area vip!");
        }
        else
        {
            System.out.println("Acesso negado!");
        }
    }
}