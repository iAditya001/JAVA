package arrays;

public class largest_no {
     public static int getLargest(int num[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];            }
        }
        return largest;
     }

    public static void main(String[] args) {
        int num[]={2,4,3,7,5};
        System.out.println("Largest number in the array is "+getLargest(num)+".");
    }
}
