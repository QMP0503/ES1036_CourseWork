package LabAssignment4.Q2;

import LabAssignment4.Lab3Q.MyMethod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WorkingWithFilesAndArrays {
    public static void main(String[] args) throws IOException {
        MyMethod.myHeader(4,2,"Sort values from sale array.");
        System.out.println("Reading the file...");
        //start reading the file
        File myFile = new File("/Users/Quang/Documents/Datafile_LabAssignment4.txt");
        //creating reference variable for the file and state its location
        Scanner inputFile = new Scanner(myFile);
        //open file
        final int size = 7;//number of sale data and assume we know how the number.
        double[] saleNum = new double[size]; //initiate new array to store sale data
        int i = 0;
        while (inputFile.hasNext() && i < saleNum.length)
        {
            saleNum[i] = inputFile.nextDouble();
            i++;
        }//assign each value in sale data with number starting from 0
        inputFile.close();

        System.out.println("Here is this week's sale-data...");
        WeeklySaleDataQuang wsd = new WeeklySaleDataQuang(saleNum);
        wsd.displaySaleData();
        System.out.printf("\nHighest weekly Sale: %.2f\n", wsd.getHighestSale());
        System.out.printf("Lowest weekly Sale: %.2f\n", wsd.getLowestSale());
        System.out.printf("Average weekly Sale: %.2f\n", wsd.getAverageSale());
        System.out.printf("Standard Deviation of Weekly Sale: %.2f\n", wsd.getStandardDeviation());
        //Display processed value
        System.out.println(".. Updating the file with the above info...\n");

        FileWriter fw = new FileWriter(myFile,true);
        PrintWriter editFile = new PrintWriter(fw);
        editFile.printf("\nHighest weekly Sale: %.2f\n", wsd.getHighestSale());
        editFile.printf("Lowest weekly Sale: %.2f\n", wsd.getLowestSale());
        editFile.printf("Average weekly Sale: %.2f\n", wsd.getAverageSale());
        editFile.printf("Standard Deviation of Weekly Sale: %.2f\n", wsd.getStandardDeviation());
        editFile.print("\nReported by: Quang Pham");
        //adding new changes to the file
        editFile.close();
        //closing edit to prevent everything from being deleted.
        MyMethod.myFooter(2);
        //sign off message
    }
}
