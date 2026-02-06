import java.util.Scanner;

public class binary2decimal {
    public static int BinToNum(int n){
       int pow=0;
       int dec=0;
       while(n>0){
int lastdigit=n%10;
            dec=dec+ (lastdigit*(int)Math.pow(2,pow ));
            pow++;
            n=n/10;
       }
    return dec;

    }
    public static void main(String[] args) {
         System.out.print("Enter the numbers in binary: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The enterd binary number in decimal is "+
        (BinToNum(n))+".");
        sc.close();


    }
}
