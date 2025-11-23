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
# check current branch and last commit
git branch --show-current
git log -1 --oneline

# push the committed code to the remote (uses current branch)
git push origin HEAD

# if upstream isn't set, set it explicitly (replace <branch> with the branch name shown above)
git push -u origin <branch>cd /Users/aditya/Desktop/java
git add functions/binary2decimal.java
git commit -m "Fix binary2decimal: remove stray git lines and syntax errors"
git push origin HEAD
# if upstream isn't set:
# git push -u origin <branch>
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
