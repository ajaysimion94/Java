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
        for(int i=0; i<rnum.length;i++){
            for(int j=0; j<rnum[i].length;j++){
                rnum[i][j]=(int)(Math.random()*100);
                System.out.print(rnum[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("\nJagged Array\n");
        //jagged Array
        int[][] jarr=new int[3][];
        jarr[0]= new int[3];
        jarr[1]=new int[40];
        jarr[2]=new int[30];
        for(int i=0; i<jarr.length;i++){
            for(int j=0;j<jarr[i].length;j++){
                jarr[i][j]=(int)(Math.random()*100);
                // System.out.print(jarr[i][j] + " ");
            }
            // System.out.println("\n");
        }
        for(int i[]:jarr){
            for(int j:i){
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }
        // 3D Array
        System.out.println("\n3D Array\n");
        int[][][] tarr3=new int[3][4][5];
        for(int i=0; i<3;i++){
            for(int j=0; j<4;j++){
                for(int k=0;k<5;k++){
                    tarr3[i][j][k]=(int)(Math.random()*100);
                    System.out.print(tarr3[i][j][k] + " ");
                }
                System.out.println("\n");
            }
            System.out.println("\n");
        }
    }
    
}
