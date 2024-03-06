public class ExceptionalHandlinginJava {
    private static final Exception ArithmeticException = null;
    private static final Exception ArrayIndexOutOfBoundsException = null;

    public static void main(String[] args) {
        // System.out.println(2/0);
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at ExceptionalHandlinginJava.main(ExceptionalHandlinginJava.java:3)
        int[] srr=new int[5];
        try {
            System.out.println(((double)2/0));
            System.out.println(srr[5]);//Out of bound error
        } 
        // catch (Exception e) {
        //     // TODO: handle exception
        //         System.out.println("Hey you can't divide with 0");
        //     // Infinity
        //     // Hey you can't divide with 0
        //     // Same for both exception 
        // }
        catch (ArithmeticException e){
            System.out.println("Hey you can't divide with 0");
            
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Check Array");
        }
    }
}
