import java.util.Scanner;

public class binomial_coeff {
    public static int Bino(int n,int r){
        int f=1;
        for(int i=1;i<=n;i++){

            f=f*i;

        }
        int f2=1;
        for(int i=1;i<=r;i++){
            f2=f2*i;
        }
        int f3 = 1;
        
        for(int i=1;i<=(n-r);i++){
            f3=f3*i;
        }
        return f/(f2*f3);
    
         

    }
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r=sc.nextInt();
        
        System.out.println("The binomial coeffecient of the "+
       "entered number is "+ Bino(n, r));
       sc.close();

    }
    
}
