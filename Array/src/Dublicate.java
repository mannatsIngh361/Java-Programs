import java.util.Scanner;


public class Dublicate {
    public static int Dub(int arr[]){
        for(int i=0;i<arr.length-2;i++){
            for(int j =0; j<arr.length;j++){
                if(i==j) continue;
                if(arr[i]==arr[j]) 
                return arr[i];

            
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size];
        for(int i =0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(Dub(arr));
        sc.close();
    }
}
