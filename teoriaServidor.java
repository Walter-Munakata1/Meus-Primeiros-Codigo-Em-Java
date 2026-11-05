import java.util.Scanner;


public class teoriaServidor
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ID do lote: ");
        int idInicio = scanner.nextInt();

        System.out.println("Agora informe o ID final do lote: ");
        int idFinal = scanner.nextInt();

        int totalAditados = 0;

        System.out.println(idInicio + " Inicio");
        System.out.println(idFinal + " Final");

        for(int id = idInicio; id <= idFinal; id++)
        {

            System.out.printf("[LOG pkt#%d] status:ok | verificado\n",id);

            totalAditados++;
        }
        System.out.println("O total de aditados é: " + totalAditados);

    }
}