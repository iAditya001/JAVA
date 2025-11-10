package loops;

/*import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sout
    }
    
}

*/
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        // 0 and 1 are not prime numbers...optimization ke liye
        if (n <= 1) {
            isPrime = false;
        } else {
            // check from 2 to sqrt(n)
            for (int i=2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // no need to check further
                }
            }
        }

        if (isPrime==true)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    
         sc.close();
        }
}
