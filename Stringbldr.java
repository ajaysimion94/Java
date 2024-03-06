import java.util.Scanner;

class Stringbldr{
    public static String MergeCoStr(String a, String b){
        StringBuilder merged = new StringBuilder();
        for(int i=0; i<a.length() || i<a.length();i++){
            if(i<a.length()){
                merged.append(a.charAt(i));
            }
            if(i<b.length()){
                merged.append(b.charAt(i));
            }
        }
        System.out.println(merged);
        return merged.toString();
    }
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner data=new Scanner(System.in);
        String a= data.nextLine();
        System.out.println("Enter another String: ");
        String b=data.nextLine();
        System.out.println(MergeCoStr(a, b));
    }
}