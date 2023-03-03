import java.util.Scanner;

public class LinearSearch {

    public static int Linear(int arr[], int value){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==value){
                return i;

            }    
        }
        return -1;
        
    }
    public static void main(String[] args) throws Exception {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int [] arr = new int[size];
        
        for(int i =0; i< size; i++){
            arr[i]= sc.nextInt();

        }
        int value = sc.nextInt();
        int result = Linear(arr, value);
        sc.close();
        System.out.println(result);
    }
}
