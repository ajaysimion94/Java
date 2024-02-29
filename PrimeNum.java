import java.util.Scanner;
public class PrimeNum {
    
    public static String ifPrime(int n){
        String y="It's a prime number";
        String x="Not a prime number";
        if (n<2){
            return x;
        }
        for(int i=2;i<n;i++){
            if((n%i)==0){
                return x;
            }
            else{
                return y;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=data.nextInt();
        String result=ifPrime(n);
        System.out.println(result);
        data.close();

    }
}
