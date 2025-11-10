import java.util.Scanner;

public class inverted_half_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m=sc.nextInt();
        for(int i=m;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
