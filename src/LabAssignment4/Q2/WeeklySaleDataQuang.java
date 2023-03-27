package LabAssignment4.Q2;

import LabAssignment4.Lab3Q.MyMethod;

public class WeeklySaleDataQuang {
    private double[] sale;
    public WeeklySaleDataQuang(){ //default constructor value
    }
    public WeeklySaleDataQuang(double[] mySale){
        sale = mySale; //assign constructor variable to sale array
    }
    public double getAverageSale(){
        double average = sale[0];
        for (int i= 1; i < sale.length; i++){
            average += sale[i];
            //sale value sum
        }
        return average/(sale.length);
        //calculate the average
    }
    public double getHighestSale(){
        double max = sale[0];
        for (int i = 1; i < sale.length; i++) {
            if (sale[i] > max) {
                max = sale[i];
                //Check every sale array value for the largest value and store in max variable
            }
        }
        return max; //return max value
    }
    public double getLowestSale(){
        double min = sale[0];
        for (int i = 1; i < sale.length; i++) {
            if (sale[i] < min) {
                min = sale[i];
                //Check every sale array value for the smallest value and store in min variable
            }
        }
        return min; //return min value
    }
    public void displaySaleData(){
        System.out.print("[");
        for (int i = 0; i < sale.length; i++){
            System.out.print(sale[i]);
            System.out.print(", ");
        }
        System.out.print("\b\b]");
        //display values inside sale array in the format [...,...,...]
    }
    public double getStandardDeviation(){
        double sumInDev =0;
        double standDev;
        for(int i = 0; i < sale.length; i++){
            sumInDev+= MyMethod.myPow(sale[i]-getAverageSale(),2);
            //calculate the sum function of difference between each value of sale array and average value to the power of 2
        }
        return standDev=Math.sqrt(sumInDev/sale.length);
        //calculate and return the standard deviation value
    }
}
