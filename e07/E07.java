import java.util.Scanner;

public class E07{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which multiplicand multiplication table to show?");
        int multiTable = scanner.nextInt();

        System.out.println("Until which multiplyer?");
        int multiplier = scanner.nextInt();

        for (int i=0; i<=multiplier; i++) {
            System.out.println(i + " x " + multiTable + " = " + (i*multiTable));
        }

    }

}