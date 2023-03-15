// WAP to count without using loop
public class Practice {
  static void count(int n){
        if(n<10){
            System.out.println(n);
            n++;
            count(n);
        }
    }
    public static void main(String[] args) {
        
        count(0);
    }
}
