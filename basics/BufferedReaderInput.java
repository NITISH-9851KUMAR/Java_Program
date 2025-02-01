package Java_Program.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class BufferedReaderInput {
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        //Also use Scanner sc= new Scanner(System.in);
        /* Taking input form keyboard through DataInputStream class instead of  using Scanner Class*/

        double principalAmount, rateOfInterest, numberOfYears;
        try{
            String tempString; // It is temporary Variable which take String value
            System.out.print("Enter Principal Amount: ");
            System.out.flush(); // clearing the internal buffer of the output stream and forcing any buffered data to be written out immediately
            tempString= br.readLine(); // Using readLine() of BufferedReader
            principalAmount= Double.valueOf(tempString); //Convert String value into Double

            System.out.print("Enter Rate of Interest: ");
            System.out.flush();
            tempString= br.readLine();
            rateOfInterest= Double.valueOf(tempString);

            System.out.print("Enter Number Of Year: ");
            System.out.flush();
            tempString= br.readLine();
            numberOfYears= Double.valueOf(tempString);

            double totalInterest= principalAmount*rateOfInterest*numberOfYears;
            System.out.printf("Total Interest: %.2f",totalInterest);

        }catch(IOException e){
            e.getMessage();
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
}
