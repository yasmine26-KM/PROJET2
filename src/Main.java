import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int nombreADeviner = random.nextInt(100) + 1; // entre 1 et 100
        int essaisRestants = 10;
        boolean aGagne = false;

        System.out.println(" akwaba !");
        System.out.println("Devine un nombre entre 1 et 100. Tu as 10 essais.");

        while (essaisRestants > 0) {
            System.out.print("Entre ton nombre : ");
            int guess = scanner.nextInt();

            if (guess == nombreADeviner) {
                System.out.println("Tu as deviné le bon nombre !");
                aGagne = true;
                break;
            } else if (guess < nombreADeviner) {
                System.out.println("C'est plus grand !");
            } else {
                System.out.println("C'est plus petit !");
            }

            essaisRestants--;
            System.out.println("Essais restants : " + essaisRestants);
        }

        if (!aGagne) {
            System.out.println(" c'est le mauvais nmbe. Le nombre était : " + nombreADeviner);
        }

        scanner.close();
    }
}