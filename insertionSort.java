import java.util.Scanner;
public class insertionSort{
    public static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
            
        }
    }
    public static void insertionS(int arr[]){
         
         for (int i = 1; i < arr.length; i++) {
             for(int j = i ; j > 0 ; j--){
                if(arr[j]<arr[j-1]){
                    //SWAP
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
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
       insertionS(arr);
    }
}