import java.util.Scanner;

public class inverted_half_pyramid_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m=sc.nextInt();
       // for(int i=m;i>=1;i--){
        //    for(int j=1;j<=i;j++){
                
                 // the above loop can also be written as:
                  for(int i=1;i<=m;i++){
                 for(int j=1;j<=m-i+1;j++){
                 
                System.out.print(j+" ");
            }
            System.out.println();
        }
   sc.close(); }
    
}
