import java.util.Locale;
import java.util.Scanner;

public class SobreMimScanner {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua Altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite o seu nome ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome =  scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        scanner.close();

        System.out.println("Suas informacoes sao : " + (" ") + (" ") + nome + (" ") + sobrenome + (" ") + altura + (" ") + idade);
    }

}
