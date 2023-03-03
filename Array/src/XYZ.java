import java.util.Scanner;

public class XYZ {
    public static int Linear(int arr[], int value){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==value){
                return i;

            }    
        }
        return -1;
        
    }
    static void insert(int[] arr, int size){
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<size; i++){
            System.out.println("Enter the "+i +"th Element" );
            arr[i] = sc.nextInt();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        boolean ex =true;
        while(ex){ 
        System.out.println("Enter your choice ");System.out.println("1 for insertion");
        System.out.println("2 for deletion");
        System.out.println("3 for Search");
        System.out.println("4 to exit");
        int choice= sc.nextInt();
        
        switch(choice){
        case 1:
        {
            if(arr[size-1]!=0) System.out.println("Array overflow cant insert");
            else insert(arr,size);
            break;
        }
        case 3:{
            System.out.println("give the value to search");
            int value = sc.nextInt();
           System.out.println("Value is present at index:"+ Linear(arr, value));
           break;
        }
        case 4:
        ex= false;
    }
        
        
    }

    }
}
