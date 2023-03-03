public class FindUnique {
     public static int unique(int arr[]){
        
        for(int i =0; i<arr.length;i++){
            int count =0;
            for(int j =0; j<arr.length; j++){
                if(i==j) continue;
                if(arr[i]==arr[j]) count++;
                
            }
            if(count ==0){
                return arr[i];
            }
        }
        return -1;
     }
     public static void main(String[] args) {
        int [] arr = {2 ,4 ,7 ,2 ,7};
        System.out.println(unique(arr));
     }
}
