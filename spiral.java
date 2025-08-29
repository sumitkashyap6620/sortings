import java.util.Scanner ;
public class spiral{
       public static void Display_matrix(int[][] arr){
        for (int i  = 0 ; i < arr.length ; i++){
        for(int j = 0 ; j < arr[i].length ; j++)
        System.out.print(arr[i][j]+" ");
        System.out.println();
    }
   }
    public static void prints(int[][] mat,int r ,int c ){
    int e = 1 ;
    int toprow = 0;
    int botomrow = r-1 ;
    int leftcol = 0 ;
    int rightcol = c-1 ;
    while(e <= r*c){
        // print top row 
           for(int j = leftcol ; j <=rightcol && e <= r*c ; j++ ){
            mat[toprow][j] = e ;
            e++ ;
            }
            toprow++ ;
           
        // print right column 
        for(int i = toprow ; i <= botomrow && e <= r*c; i++){
           mat[i][rightcol] = e ;
           e++ ;
           }
           rightcol-- ;
     //print bottom row
        for ( int j = rightcol ; j >= leftcol && e <= r*c ; j--){
         mat[botomrow][j] = e ;
         e++;
        }
        botomrow-- ;
        
     //print left column
     for (int i = botomrow ; i >=toprow && e <= r*c ; i--){
       mat[i][leftcol]=e ;
       e++ ;
       }
       leftcol++ ;
   }
      Display_matrix(mat);
  } 
        public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("for spiral matrix give detail \nRows :  ");
    int r = sc.nextInt(); 
    System.out.print("columns : ");
    int c = sc.nextInt();
           System.out.println("spiral oder matrix is :-");
           int [][] arr = new int[r][c] ;
           prints(arr,r,c);
         
}
}
    
 