import javax.swing.JOptionPane;
class JavaGUI{
    public static void main(String[] args) {
    int n=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
    if (n==0){
        JOptionPane.showMessageDialog(null,"Factorial: "+ 1);
    }
    else{
        System.out.println(n);
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        JOptionPane.showMessageDialog(null,"Factorial: "+fact);

 }
   
}
}