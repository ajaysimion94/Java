public class ArrayJava {
    //int num[]={34,56,67};
    //int num[]=new int[4];
   
    public static void main(String[] args) 
  
    { 
        //int num[]={34,56,67};
        int[] num=new int[4];
        num[2]=67;
        num[1]=78;
        num[3]=89;
        for (int i:num)
        System.out.print(i +" "); 
        System.out.println("\n");
        String[][] str=new String[2][5];
        // str[0]={"S.No","Name","Email","Phone","Place"}; NaH
        str[0][0]="S.NO";
        str[0][1]="Name";
        str[0][2]="Place";
        str[0][3]="Email";
        str[0][4]="Phone";
        str[1][0]="1";
        str[1][1]="Ajay";
        str[1][2]="Tenkasi";
        str[1][3]="ajaysimion@yahoo.com";
        str[1][4]="8903649178";
        for(int i=0; i<2;i++){
            for(int j=0; j<5;j++){
                System.out.print(str[i][j] + " | ");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        //Math.random()
        int[][] rnum=new int[3][3];
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                rnum[i][j]=(int)(Math.random()*100);
                System.out.print(rnum[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
    
}
