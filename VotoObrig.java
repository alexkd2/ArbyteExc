import java.util.Scanner;

public class ExercicioVOTO {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");

        int idade = scanner.nextInt();


        if(idade >= 16 && idade <=17){
            System.out.println("Voto Facultativo");
            }
        else if (idade >= 18 && idade <= 60){
                System.out.println("Voto Obrigatório");
            }

        }








    }