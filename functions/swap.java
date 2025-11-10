import java.util.Scanner;

public class swap {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Value of a after swapping is : "+a);
        System.out.println("Value of b after swapping is: "+b);
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        swap(a, b);
        sc.close();

    }
}
