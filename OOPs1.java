import java.util.Scanner;

class NumbroneObj{
    int a;
    int b;
    public int addnum(int a, int b){
        System.out.println("Adding "+a+" and "+b+" ...");
        return a+b;
    }
    public int subnum(int a, int b){
        System.out.println("Subtracting "+b+" from "+a+" ...");
        return a-b;
    }
    public int mulnum(int a, int b){
        System.out.println("Multiplying "+a+" and "+b+" ...");
        return a*b;
    }
    public int divnum(int a, int b){
        if(b>a){
            System.out.println("Invalid input");
            return 0;
        }
        System.out.println("Dividing "+a+" and "+b+" ...");
        return a/b;
    }
}
class Choicesof extends NumbroneObj{
    int choice;
    NumbroneObj addn=new NumbroneObj();
    void chooseops(int choice, int a, int b){
        switch(choice){
            case 1:
            System.out.println(addn.addnum(a, b));
            break;
            case 2:
            System.out.println(addn.subnum(a, b));
            break;
            case 3:
            System.out.println(addn.mulnum(a, b));
            break;
            case 4:
            System.out.println(addn.divnum(a, b));
            break;
            default:
            System.out.println("Something Wrong");
        }
    }

}
public class OOPs1 {
    public static void main(String[] args) {
        
        Choicesof chof=new Choicesof();
        int x,y;
        Scanner data=new Scanner(System.in);
        System.out.println("\nEnter value of a : ");
        x=data.nextInt();
        System.out.println("\nEnter value of b : ");
        y=data.nextInt();
        System.out.println("\nEnter the operation you want to do:");
        System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n");
        int c=data.nextInt();
        chof.chooseops(c, x, y);

    }
    
}
