public class DataTypeAssignment {
    public static void main(String[] args) {
        int x=2;
        int y=4;
        int multiplication=x*y;
        System.out.println("The multiplication of x and y is :"+multiplication);
        // Question 2.Print the ASCII value of character ‘U’.
        //first take an integer to store U
        int a = 'U';
        // print the ASCII value of the given character
        System.out.println(a);

        //Question 3.- Write a Java program to take the length and breadth of a rectangle and print its area.
        int l=7;
        int b=4;
        int area=l*b;   //area of rectangle is length* breath
        System.out.println("Area of rectange is :"+area);

        //Question 4.Write a Java program to calculate the cube of a number.
        //first take an integer which is find out the value
        int z=4;
        int cubeOfNumber=z*z*z;
        System.out.println("Cube of the number is :"+cubeOfNumber);


        //Question 5.Write a Java program to swap two numbers with the help of a third variable.
        int p=2;
        int q=3;
        System.out.println("Before swap the are:"+p+","+q);
        //take a temp variable in which store the first varible value
        int temp=p;
        //now to store q in p
        p=q;
        //now to store q to the value of tem[p variable
        q=temp;
        System.out.println("After swap the value :"+p+ ","+q);
    }
}
