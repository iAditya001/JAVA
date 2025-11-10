import java.util.Scanner;

public class sum2 {
    public static int Add(int a,int b){// formal parameters or paramters(definition)
    int sum=a+b;
    
    return sum;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the value of a: ");
     int a=sc.nextInt();
     System.out.print("Enter the value of b: ");
     int b=sc.nextInt();
     int SUM=Add(a,b); // arguments or actual parameters (calling)
     System.out.println("Sum is " + SUM+".");

sc.close();
    }

    
}
