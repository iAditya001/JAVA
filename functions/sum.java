import java.util.Scanner;

public class sum {
    public static int ADD(int a, int b){
       
        int sum=a+b;
        System.out.print("Sum is "+sum);
        return sum;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=sc.nextInt();
        System.out.print("Enter the value of b:");
        int b=sc.nextInt();
    
        ADD(a,b);
        
    }
    
}
