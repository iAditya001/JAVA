import java.util.Scanner;

public class prod {
    public static int Prod(int a,int b){
        int prod=a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        System.out.print("The product of a and b is: "+ Prod(a, b)+".");
        sc.close();
    }
    
}
