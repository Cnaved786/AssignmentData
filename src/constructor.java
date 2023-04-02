class Algebra{
    int x;
    int y;
       Algebra(int a,int b){
           x=a;
           y=b;
           System.out.println("Constructors in algebra class");
       }
       int add(){
           return x+y;
       }
       int sub(){
           return x-y;
       }
       int mul(){
           return x*y;
       }


}
public class constructor {
    public static void main(String[] args) {
      Algebra al =new Algebra(10,3);
        System.out.println(al.add());
        System.out.println(al.sub());
        System.out.println(al.mul());
    }
}
