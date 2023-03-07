public class Findlargest {
    public static int largest(int[] arr){
        int max= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
    public static int minimum(int[] arr){
        int min = arr[0];
        for(int i =0; i<arr.length;i++){
            if(arr[i]<min) min=arr[i];
        }
        return min;
    }
        public static void main(String[] args) {
            int []arr = {125,737,636,67364,737,37337,25};
            System.out.println("Minimum value in array is: "+ minimum(arr));
            System.out.println("Maximum value in array is: "+ largest(arr));

            
        }
}
