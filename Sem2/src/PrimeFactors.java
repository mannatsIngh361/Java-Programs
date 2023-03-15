public class PrimeFactors {
    static boolean isPrime(int N){
        if(N==1) return false;
        if(N==3||N==2) return true;
        if(N%2==0|| N%3==0) return false;
        for(int i =5;i*i<=N;i=i+6){
            if(N%i==0) return false;
        }
        return true;
    }
    static void primefac(int N){
        for(int i =2;i<=N;i++){
            if(isPrime(i)){
                while(N%i==0){
                    System.out.println(i);
                    N/=i;
                }
            }
        }
    }
    public static void main(String[] args) {
        primefac(13);
    }
}
