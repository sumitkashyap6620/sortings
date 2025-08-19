import java.util.Scanner;
public class meargeSort{
    public static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
           
        }
    }
    public static void sort(int[] arr , int l , int mid , int r ){

    }
    public static void meargeS(int arr[] , int l , int r ){
            int mid = (l+r)/2 ;
            meargeS(arr,l,mid);
            meargeS(arr , mid+1 , r);
            sort(arr , l , mid , r);
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
       meargeS(arr,0,arr.length-1);
    }
}