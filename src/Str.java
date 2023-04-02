import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your string :");
        String st = sc.nextLine();
        System.out.println(st);
        String[] array=st.split(" ");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i] +" ");
        }
//        for(String c:array){
//            System.out.println(c);
//
//        }
//        int left =0;
//        int right =st.length()-1;
//        while(right>left){
//            if(st.charAt(left)!=st.charAt(right)){
//                System.out.println("String is not palindrome");
//                break;
//            }
//            left++;
//            right--;
//
//        }
//        System.out.println("IS aplindrome");



//     int count=0;
//       for(int i=0;i<st.length();i++){
//           if(st.charAt(i)!= ' '){
//               count++;
//           }
//       }


//   for(char c:temparray){
//       System.out.print(c);
//   }
//        System.out.println();

    }


}
