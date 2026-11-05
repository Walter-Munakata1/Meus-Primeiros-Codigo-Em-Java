import java.util.Scanner;


public class BalancoTrimestral{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe as despesas de janeiro(R$): ");
        double gastosJaneiro = scanner.nextDouble();
        System.out.println("Informe as despesas de fevereiro(R$): ");
        double gastosFevereiro = scanner.nextDouble();
        System.out.println("Informe as despesas de marco(R$): ");
        double gastosMarco = scanner.nextDouble();

        double soma = (gastosJaneiro + gastosFevereiro + gastosMarco);
        double media = soma / 3.0;

        System.out.println("A soma das despesas total é R$: " + soma);
        System.out.println("A media dos gastos é R$: " + media );
        scanner.close();
    }
}