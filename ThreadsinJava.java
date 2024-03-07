// // class ThreadA extends Thread{
// class ThreadA implements Runnable{
//     public void run(){
//         for(int i=0;i<100;i++){
//             System.out.println("Hi");
//         }
//     }
// }
// // class ThreadB extends Thread{
// class ThreadB implements Runnable{
//     public void run(){
//         for(int i=0;i<100;i++){
//             System.out.println("Hello");
            
//         }
//     }
// }
public class ThreadsinJava {
    public static void main(String[] args) {
        // ThreadA Aobj=new ThreadA();
        // ThreadB Bobj=new ThreadB();
        // Runnable a functional interface so  we can use lambda 
        Runnable Aobj= () ->{
            for(int i=0;i<100;i++){
            System.out.println("Hi");
        }
        };
        Runnable Bobj= () ->{
            for(int i=0;i<100;i++){
            System.out.println("Hello");
        }
        };
        Thread t1=new Thread(Aobj);
        Thread t2= new Thread(Bobj);
        // Aobj.start();
        t1.start();
        try{
            Thread.sleep(5);
        }catch (Exception e){
            System.out.println(e);
        }
        t2.start();
        // Bobj.start();
    }
}
