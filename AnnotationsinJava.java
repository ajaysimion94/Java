class AnoA{
//  public void show(){
//     System.out.println("Its Class AnoA");
//  }
public void showTheMessageThatInThisClass(){
    System.out.println("Its Class AnoA");
}
}
class AnoB extends AnoA{
    // public void show(){
    //     System.out.println("Its Class AnoB");
    // }
    @Override
    // public void showTheMessageThatInThis(){//Here I missed Class at the end of the method name that suppose to override then it will give different output
    //     System.out.println("Its Class AnoB");//We need to know where we make mistakes so we use annotations
    // } // It will through error that this function not in super class
    public void showTheMessageThatInThisClass(){
        System.out.println("Its Class AnoB");
    }
}
public class AnnotationsinJava {
    public static void main(String[] args) {
        // AnoB b=new AnoB();
        // b.show();
        // AnoA c=new AnoB();//used AnoA as reference
        // c.show();
        // AnoA a=new AnoA();
        // a.show();
        // Its Class AnoB
        // Its Class AnoB
        // Its Class AnoA
        AnoB b=new AnoB();
        b.showTheMessageThatInThisClass();
        AnoA c=new AnoB();//used AnoA as reference
        c.showTheMessageThatInThisClass();
        AnoA a=new AnoA();
        a.showTheMessageThatInThisClass();
    }
}
//Done
//