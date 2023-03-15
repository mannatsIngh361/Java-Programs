// print true if the number is prime
public class prime{
    static boolean isprime(int N){
    
    for (int i =2;i*i<N;i++){
        if(N%i==0){
            return false;
        }
    }
    return true;
    }
    public static void main(String[] args) {
        System.out.println(  isprime(25));
    }
    
}
