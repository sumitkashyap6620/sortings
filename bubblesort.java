import java.util.Scanner;
public class bubblesort{
    public static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
            
        }
    }
    public static void bubbleS(int arr[]){
         
          for (int i = 0; i < arr.length-1; i++) {
              
            for(int j = i+1; j < arr.length ; j++){
                if(arr[i]>arr[j]){
                //SWAP
                int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp ;

              }
            }
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
       bubbleS(arr);
    }
}