import java.util.Scanner;

 class AcumuladorContratos
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero de contratos desse lote:  ");
        int limite = scanner.nextInt();

        int contador = 1;
        int somaAcumulada = 0;

        while(contador <= limite)
        {
            somaAcumulada += contador;
            contador++;
            System.out.println("A soma acumulada é: " + somaAcumulada);
        }
    }
}