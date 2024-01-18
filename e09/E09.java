
import java.util.Scanner;

public class E09{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean isValid = true;
        double totMark = 0.0;
        double avgMark = 0.0;
        int subject = 1;

        while(isValid) {
            System.out.println("Give a test score (-1 to quit):");
            double inputMark = scanner.nextDouble();

            if (inputMark== -1){
                System.exit(0);
                } else {
                    totMark += inputMark;
                    avgMark = totMark / subject;
                    }
                    System.out.println("Average: " + avgMark);
                    subject++;
        }


    }



} 

