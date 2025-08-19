import java.util.Scanner;
public class meargeSort{
    public static void display(int arr[]){
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] +" ");
     }
    public static void mearge(int[] arr , int l , int mid , int r ){
       int n1 = mid-l+1 ;
       int n2 = r-mid ;
       int w = l ;
       int[] left = new int[n1];
       int[] right = new int[n2];
       for (int i=0 ; i < n1 ; i++)
        left[i] = arr[l++];
       for (int i=0 ; i < n2 ; i++){
        right[i] = arr[mid+1];
        mid++ ;
       }
       l = w ;
       int i = 0 ; 
       int j = 0 ;
       int k = l ;
       while ( i < n1 && j < n2 ){
        if (left[i]<=right[j])
        arr[k++] = left[i++] ;
       else
         arr[k++] = right[j++] ;
       }
       while(i<n1)
        arr[k++] = left[i++];
    while(j<n2)
        arr[k++] = right[j++];
    }
    public static void meargesort(int arr[] , int l , int r ){
            if(l>=r)return;
            int mid = (l+r)/2 ;
            meargesort(arr,l,mid);
            meargesort(arr , mid+1 , r);
            mearge(arr , l , mid , r);   
    }
    public static void main (String args[]){
        System.out.print("give length :- ");
        Scanner sc = new Scanner (System.in);
        int arr[] = new int[sc.nextInt()];
       System.out.println("give elements :-");
       for (int i = 0; i < arr.length; i++) 
          arr[i] = sc.nextInt(); 
        meargesort(arr,0,arr.length-1);
        System.out.print("shorted array :");
          display(arr);
    }
}