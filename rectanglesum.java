import java.util.Scanner ;
public class rectanglesum{
    public static void Display_matrix(int[][] arr){
        for (int i  = 0 ; i < arr.length ; i++){
        for(int j = 0 ; j < arr[i].length ; j++)
        System.out.print(arr[i][j]+" ");
        System.out.println();
    }}
    public static void rsum(int[][] mat , int r1 ,int c1 , int r2 , int c2 ){
       int sum = 0 ;

    //    root force approach

    //    for (int i = r1 ; i = r2 ; i++){
    //    for(int j = c1 ; j = c2 ; j++)
    //    sum += mat[i][j] ; }

    // by prifix rows for n Quarries 
  
     for (int i = 0 ; i < mat.length ; i++){
        
        for (int j = 1 ; j < mat[0].length ; j++){
            mat[i][j] += mat[i][j-1] ;
        }
     }
        System.out.println("sum is :- "+ sum);
        Display_matrix(mat);
    }
        public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("for spiral matrix give detail \nRows :  ");
    int r = sc.nextInt(); 
    System.out.print("columns : ");
    int c = sc.nextInt();
           System.out.println("give matrix :-");
           int [][] arr = new int[r][c] ;
         for (int i  = 0 ; i < r; i++)
        for(int j = 0 ; j < c ; j++)
        arr[i][j] = sc.nextInt();
      System.out.print("give indexes  :- \n r1 :- ");
      int r1 = sc.nextInt();
      System.out.print(" c1 :- ");
      int c1 = sc.nextInt();
      System.out.print(" r2 :- ");
      int r2 = sc.nextInt();
      System.out.print(" c2 :- ");
      int c2 = sc.nextInt();   
        rsum(arr, r1, c1, r2, c2);
        sc.close();
        }
    }

    
 