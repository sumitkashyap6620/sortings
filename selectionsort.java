import java.util.Scanner;
public class selectionsort{
    public static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
            
        }
    }
     
    public static void selectionS(int arr[]){
         
          for (int i = 0; i < arr.length; i++) {
              int minpos = i ; // assume the first element is the minimum
            for(int j = i+1; j < arr.length ; j++){
                if(arr[minpos]>arr[j]){
                minpos = j ; // update the position of minimum element
                }
                //SWAP
             }
               int temp = arr[minpos];
                 arr[minpos] = arr[i];
                 arr[i] = temp ;
          }
          System.out.print("shorted array :");
          display(arr);
    }
     public static void main (String args[]){
        System.out.print("give length :- ");
        Scanner sc = new Scanner (System.in);
        int arr[] = new int[sc.nextInt()];
       System.out.println("give elements :-");
       for (int i = 0; i < arr.length; i++) {
          arr[i] = sc.nextInt(); 
       }
       selectionS(arr);
    }
}