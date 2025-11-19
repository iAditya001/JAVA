import java.util.Scanner;

public class BinaryToDecimal {
    public static void BinToDec(int BinNum){
       int pow=0;
        int dec=0;
        while(BinNum>0){
            int lastdigit=BinNum%10;
            dec=dec+ (lastdigit*(int)Math.pow(2,pow ));
            pow++;
            BinNum=BinNum/10;
        }
        System.out.print(BinNum +" in decimal is "+ dec);

    }
    public static void main(String[] args) {
        BinToDec(1010);
    }
}
    