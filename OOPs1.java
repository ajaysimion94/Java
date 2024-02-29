class NumbroneObj{
    int a;
    int b;
    NumbroneObj(){
        System.out.println("Constructor....");
    }
    public int addnum(int a, int b){
        System.out.println("Adding "+a+" and "+b+"...");
        return a+b;
    }
}
public class OOPs1 {
    public static void main(String[] args) {
        NumbroneObj addn=new NumbroneObj();
        System.out.println("result = "+addn.addnum(5,6));

    }
    
}
