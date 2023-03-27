package LabAssignment4.Q1;
import LabAssignment4.Lab3Q.MyMethod;
import java.util.Scanner;

public class TwoDArrayMultiplicationQuang {
    public static void populate2DArray(int[][] ma) {
        int random;//int type variable called random
        for (int r = 0; r < ma.length; r++) { //ma.length is the row
            for (int c = 0; c < ma[r].length; c++) {//ma[r].length is number of columns inside the row;
                random = (int) (Math.random() * (5 - 2) + 2);//generate random number
                ma[r][c] = random;//assign random value to position (c,r)
            }
        }
    }
    public static void display2DArray(int[][] ma) {
        for (int r = 0; r < ma.length; r++) {
            for (int c = 0; c < ma[r].length; c++) {
                System.out.printf("%3d", ma[r][c]);//print all column value for row r
            }
            System.out.print("\n");//move down to next line to print column values for next row
        }
    }
    public static int[][] multiplyArrays ( int[][] a, int[][] b){
        int[][] result = new int[a.length][b[0].length];
        for (int r = 0; r < result.length; r++) {
        //loop to move to next row in result array
            for (int c = 0; c < result[r].length; c++) {
            //loop to move to next column in row r
                for (int k = 0; k < b.length; k++) {
                    //loop for operation of array multiplication
                    result[r][c] += a[r][k] * b[k][c];
                    //multiply and add value in a array row and b array column
                }
            }
        }
        return result; //return result array
    }
    public static Scanner input = new Scanner(System.in);//initialize scanner
    public static void main(String[] args){
        MyMethod.myHeader(4,1,"Array multiplier.");
        System.out.println("Multiplying two 2D arrays: ");
        System.out.println("Enter array1 info: ");
        System.out.print("\tEnter row-size: ");
        int rs1 = input.nextInt();
        System.out.print("\tEnter column-size: ");
        int cs1 = input.nextInt();
        //Prompt user to input the row and column size of 2D array ma1 and store the values as rs1 and cs1
        int[][] ma1 = new int[rs1][cs1];
        //the row and column size of array ma1 is assigned with rs1 and cs1 values
        populate2DArray(ma1); //populate ma1 with random value between 2 and 5
        System.out.println("Enter array2 info: ");
        System.out.print("\tEnter row-size: ");
        int rs2 = input.nextInt();
        //Prompt user to input the row size of 2D array ma2 and store the values as rs2
        while(rs2!=cs1){
            System.out.println("Row size of the 2nd matrix has to be equal to the column size of first matrix!");
            System.out.print("\tEnter again: ");
            rs2 = input.nextInt();
            //check of the value for rs2 equal cs1 to that the array multiplication is possible
            //if not prompt user to enter again
        }
        System.out.print("\tEnter column-size: ");
        int cs2 = input.nextInt();
        //prompt user to enter column size cs2 for array ma2
        int[][] ma2 =new int[rs2][cs2];
        //the row and column size of array ma2 is assigned with rs2 and cs2 values
        populate2DArray(ma2);//populate ma2 with random value between 2 and 5
        System.out.printf("\nElements of Array 1, Size[%d x %d]:\n",rs1,cs1);
        display2DArray(ma1);
        //Display values of 2D array ma1 with its row and column size
        System.out.printf("\nElements of Array 2, Size[%d x %d]:\n",rs2,cs2);
        display2DArray(ma2);
        //Display values of 2D array ma2 its row and column size
        System.out.println("\nMultiplying two arrays [Array 1 x Array 2]..");
        System.out.printf("The resultant size is: [%d x %d].\n",rs1,cs2);
        System.out.println("The elements are... ");
        display2DArray(multiplyArrays(ma1,ma2));
        //Calculate and display the new array when array ma1 and ma2 are multiplied
        System.out.print("\n");
        MyMethod.myFooter(1);
        //display sign-off message
    }
}
