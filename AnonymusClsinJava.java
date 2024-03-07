//Create a interface
/**
 * InnerAnonymusClsinJava
 */
interface InnerAnonymusClsinJava {
    void show();
}
// class InnerAnonymusClsinJava_1 implements InnerAnonymusClsinJava {

//     public void show(){
//         System.out.println("In a implemented class");
//     }
// }
public class AnonymusClsinJava {
    public static void main(String[] args) {
        InnerAnonymusClsinJava obj1= new InnerAnonymusClsinJava() {
            public void show(){
                System.out.println("Hello World");
            }
        };

        obj1.show();
    }
}
