public class Insrtsort {
        public static void insertsort(int [] arr, int n ){
            int key,i;
            for(int j =1;j<n;j++){ 
            key = arr[j];
            i = j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1]=arr[i];
                i=i-1;
                arr[i+1]=key;
            }
        }
        System.out.println("Sorted array is ");
        for(int k=0; k<n; k++){
            System.out.print(arr[k]+ " ");
        }
    }
        public static void main(String[] args) {
            int [] arr = {1,3,4,65,877,23,-1,6} ;
            insertsort(arr, arr.length);
        }

}
