import java.util.Scanner;

public class E08{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean checkNum = true;

        while (checkNum) {
            System.out.println("Enter a number (0 to quit):");
            int num = scanner.nextInt();

            if (num==0) {
                checkNum = false;
            } else {
                if (num % 2 ==0) {
                    System.out.println("Number is even");
                    } else {
                    System.out.println("Number is odd");
                    }

            }


        }
        
        

    }


}