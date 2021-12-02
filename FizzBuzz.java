import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("Hello");



        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.print("Fizz");
        }


        
    }
}

