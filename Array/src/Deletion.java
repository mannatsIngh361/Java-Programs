import java.util.ArrayList;
import java.util.Scanner;
// WAP to delete a element form arraylist
public class Deletion {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("Elements in arr:"+ arr);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element to delete");

        int a = sc.nextInt();
        arr.remove(Integer.valueOf(a));

        System.out.println("Array after removal:"+ arr);

        sc.close();
        


        
        
    }
}
