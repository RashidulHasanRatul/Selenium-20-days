package Basic;

public class Array {
    public static void main(String[] args) {
         /*
         *  Array Declare
         int datatype[] = new datatype [size];
         * */


        int numbers [] = new int[5]; // Single Dimensional Array

        numbers [0] = 10;
        numbers [1] = 11;
        numbers [2] = 12;
        numbers [3] = 13;
        numbers [4] = 14;



// Always use for Each loop for iterating Array

        for (int i=0;i<=4;i++){

            System.out.println(numbers[i]);

        }

        for (int j:numbers){
            System.out.println("This is Foreach"+j);
        }

        // Unlimited Array Size Declare

        int data []= {1,2,3,4,500 };
        for (int x:data){
            System.out.println(x);
        }

        // Object Type
        // Object is Special Type of Array where every type of data can be store

        Object strng[] = new Object[5];
        strng[0] = 9; // Integer
        strng[1] = "Hello"; // String
        strng[2] = 3.3; // double

        for (Object s:strng){
            System.out.println(s);
        }


    }
}
