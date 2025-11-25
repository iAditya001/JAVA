package arrays;
import java.util.Scanner;

public class arraysCC2 {
    public static void update(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();  // size of array

        int marks[] = new int[n];

        System.out.println("Enter the marks:");
        for(int i = 0; i < n; i++){
            marks[i] = sc.nextInt();
        }

        update(marks);

        System.out.println("Updated Marks:");
        for(int i = 0; i < n; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
