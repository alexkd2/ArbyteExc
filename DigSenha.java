import java.util.Scanner;

public class Exercicio3Strings {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite uma senha");

        String senha = scanner.nextLine();

        if(senha.length() >= 8) {
            System.out.println("Tudo certo!");

        } else {
            // verificação
            System.out.println(" A senha tem que ter no mínimo 8 caracteres");
        }


    }
}