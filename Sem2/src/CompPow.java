
//computation of power using recursion

public class CompPow {
    static int Power(int X,int N){
        if(N==0)
            return 1;
        int temp=Power(X,N/2);
        if(N%2==0)
        return temp*temp;
        else 
        return temp*temp*X;

    }
    public static void main(String[] args){
        System.out.println(Power(2,4));
    }

}
