import java.util.Arrays;
import java.util.Scanner;
public class Hello {
      public static int factorial(int x){
          if(x!=0){
              return x*factorial(x-1);
          }
          else return 1;
      }

    public static void main(String[] args){
  Scanner sc =new Scanner(System.in);
        System.out.println("Enetr the size of an array");
        int size=sc.nextInt();
        // Declaratiob of ab array is
        int[] array= new int[size];
        System.out.println("Enetr the element of array");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array element are=");
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
//        System.out.println("Enter the Search Element:");
//        int key=sc.nextInt();
//      boolean resulr=SearchElement(array,key);
//        System.out.println(resulr);


        System.out.println("Enter the Search element");
        int key=sc.nextInt();
        System.out.println("Search element is " +key);
        int result=BinarySearch(array,size,key);
        System.out.println(result);
    }
    public static void SearchElement(int[] A, int key){
          int n=A.length;
          for(int i=0;i<n;i++){
              if(key==A[i]){
                  System.out.println("Index at the position"+i);
              }

          }

        System.out.println("Not found the element");
    }
    public static void ReverseArray(int arr[],int n){
          for(int i=n-1;i>=0;i--){
              System.out.print(arr[i]+" ");
          }
    }
    public static int BinarySearch(int arr[],int size,int key){
         int l,h,mid;
         l=0;
         h=size-1;

         while(l<=h){
             mid=(l+h)/2;
             if(arr[mid]==key){
                 return mid;
             } else if (key>arr[mid]) {
                 l=mid+1;
             } else  {
                 h=mid-1;
             }

         }
         return -1;




    }
//    public static int RecursiveBinary(int arr[],int size,int key){
//
//    }
}
