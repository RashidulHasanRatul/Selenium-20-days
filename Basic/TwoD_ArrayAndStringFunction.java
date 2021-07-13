package Basic;

public class TwoD_ArrayAndStringFunction {
    public static void main(String[] args) {
        // Multi Dimensional Array

        int number [] [] = new int [3][2]; // Declaration

        // Storing elements on array
        number[0][0] = 10;
        number[0][1] = 11;

        number[1][0] =30;
        number [1][1] =31;



// Classic for loop

        for (int row=0;row<2;row++){  // For Increment Row
            for (int col=0;col<2;col++){ // For Increment Column

                System.out.println("This is 2D Array Example"+number[row][col]);
            }
        }


    }
}
