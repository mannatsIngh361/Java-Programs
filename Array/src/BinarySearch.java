public class BinarySearch {
    static int Binary(int[] arr,int element){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        
        while(low <=high){
            int mid = (low + high)/2;
            if(element==arr[mid])
                return mid;
        
            if(element>arr[mid])
                low = mid +1;
            else 
                high = mid-1;
        }
        return -1;
    }
        public static void main(String[] args) {
            int[] array= {1,2,3,4,5,6,7,8,9};
            System.out.println(Binary(array, 9));
        }
    }

