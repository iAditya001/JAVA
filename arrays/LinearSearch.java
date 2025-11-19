package arrays;

public class LinearSearch {
    public static int linearSearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        int numbers[]={4,6,3,19,20,2,45,65};
        int key=2;
        int index=linearSearch(numbers, key);
        if(index==-1){
         System.out.print("Not Found");
        }
        else{
            System.out.print("Key is at index "+index+".");
        }
    }

    
}
