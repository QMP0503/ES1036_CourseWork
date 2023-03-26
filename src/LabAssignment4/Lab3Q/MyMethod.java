package Lab3Q;

public class MyMethod {
    final public static double PI=3.141592653589793;

    public static double myPow(double x, int y){
        double xPow = 1;//Initialize double variable
        if(y>0){
            for (int i = 0; i < y; i++){
                xPow = xPow * x;
            }
            return xPow;
            //Check for positive y value and runs loop until limit is reached
        }
        if(y<0){
            for (int i = 0; i < Math.abs(y); i++){
                xPow = xPow * x;
            }
            return 1/xPow;
            //Checks for negative y value and runs loop until limit is reached
        }
        else
            return 1;
        //Return only possible value for num^0=1
    }
    public static double myFactorial(int n){
        double nFact = n;
        if (n == 0)
            return 1;
        //returns 1 if factorial is zero
        else {
            for (int i = 1; i < n; i++){
                nFact *= i;
            }
        }
        return nFact;
        //Return calculated for n!
    }
    public static double mySin(double x){
        double xSin = 0;
        for (int i=0; i<20; i++){
            xSin += myPow(-1,i)/myFactorial(2*i+1)*myPow(x,2*i+1);
        }
        return xSin;
        //runs through the loop 20 times and return the solution using sine in degrees
    }
    public static double myCos(double x){
        double xCos = 0;
        for (int i=0; i<20; i++){
            xCos += myPow(-1,i)/myFactorial(2*i)*myPow(x,2*i);
        }
        return xCos;
        //runs through the loop 20 times and return the solution using cosine in degrees
    }
    public static double myDegreeToRadian(double degree){
        return degree*PI/180;
    }
    public static char myToLowerCase(char c){
        if(c>= 65 && c<=90) {
            c += 32;
            return c;
            //Check for upper case character using ASCII table and convert to lower case by adding 32.
        }
        else{
            return c;
            //return all input in range
        }
    }
    public static void myHeader(int labNum, int questionNum, String description) {
        System.out.println("****************************************************\n" +
                "Full Name: Quang Pham\n" +
                "Lab Assignment: " + labNum + " ,Question: " + questionNum);
        System.out.println("Program Description: " + description);
        System.out.println("*****************************************************");
    }//Print full name, lab exercise, question number and program description
    public static void myFooter(int questionNumber){
        System.out.println("*** Signing off from Question " + questionNumber + " – Quang ***");
    }
    //Prints footer with question number
}
