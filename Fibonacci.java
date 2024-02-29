import java.util.Scanner;
public class Fibonacci{
    public static void fibo(int n){
        if(n<=0){
            System.out.println(0);
        }
        else{
            int f=0;
            int x=1,e;
            System.out.println("\n"+f+'\n'+x);
            for(int i=0;i<n;i++){
                e=f+x;
                f=x;
                x=e;
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=data.nextInt();
        fibo(n);
        data.close();
    }
}