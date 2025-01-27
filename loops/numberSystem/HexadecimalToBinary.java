package Java_Program.loops.numberSystem;

import java.util.Scanner;

public class HexadecimalToBinary {

    public static void forLoop(int index, StringBuilder val){ //print final binary value after remove zero from beginning position
        for(int i=index;i<val.length();i++){
            System.out.print(val.charAt(i));
        }
    }
    public static String binaryValue(int number){
        //Return the binary number of formal parameter number

        //This loop find the binary number
        if(number==0) return "0000"; // if number=0 then return 0000 and functions is terminated
        int num= number;
        int rem,val= 0;
        int pow= 1;
        while(num!= 0){
            rem= num % 2;
            val= val + (rem * pow);
            pow*= 10;
            num/= 2;
        }
        //val variable store binary number

        //we need to return binary value in four digit
        //if binary number 1 digit then we add 000 3 zero extra at first place
        //if binary number 2 digit then add 00 2 zero extra at first place
        //if binary number 3 digit then add 0 1 zero extra at first place
        //if binary number is already four digit no need to add extra zero
        if(number==1) return "000"+val;
        else if(number<=3) return "00"+val;
        else if(number >3 && number<8) return "0"+val;
        else return ""+val;
    }
    public static String binaryFunction(char digit){
        //There are only two type of digit value either integer value or character value
        //For character value case will work , it is not character value then default will work

        String binaryNumber; //Define String type variable, store binary number
        switch(digit){
            case 'A':   // Decimal Value A || a -> 10
            case 'a':
            case 'B':   // Decimal Value B || b -> 11
            case 'b':
            case 'C':   // Decimal Value C || c -> 12
            case 'c':
            case 'D':   // Decimal Value D || d-> 13
            case 'd':
            case 'E':   // Decimal Value E || e -> 14
            case 'e':
            case 'F':   // Decimal Value F || f -> 15
            case 'f':

                    //convert into ASCII value, of character
                    int intVal= (int)digit;

                    int actVal; // Actual Value store hexadecimal value of character suppose A= 10.....
                    if (intVal<91)  actVal= (intVal-55); //For Big Character , minus 55
                    else actVal= (intVal-87);  //For small character, minus -85
                    binaryNumber= binaryValue(actVal); //call binaryValue function with argument to find the binary number
            break;

            default:
                    //variable digit is character value
                    //change character to string
                    String str= String.valueOf(digit);
                    //change string to Integer
                    int num= Integer.parseInt(str);
                    binaryNumber= binaryValue(num); //call binaryValue function with argument to find the binary number
                    break;
        }
        return binaryNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Take input Hexadecimal Value;
        System.out.print("Enter Hexadecimal Number: ");
        String hexValue = sc.next();

        //if first position of string is 0 then skip and go on second position
        int startIndex=0;
        if(hexValue.charAt(0)=='0'){
            startIndex= 1;
        }

        //create a StringBuilder that save the binary value and print in last
        StringBuilder val= new StringBuilder("");

        //Loop execute, size of string-1 time
        for(int i=startIndex;i<hexValue.length();i++){
            char ch= hexValue.charAt(i); //Take position by character of String
            val= val.append(binaryFunction(ch)); //call binaryFunction function which calculate the binary number and add into val StringBuilder
        }

        //finally print the value of val StringBuilder which is actually binary number od hexadecimal value
        System.out.println("Binary Value            : "+val);

        //This if statement only remove zero from beginning  position
        if(val.charAt(0)== '0'){ //if First position zero then we don't need to print first place 0
            System.out.print("Shorted Binary Value    : ");
            int indexStart;

            if(val.charAt(1)== '0'){ //if second place zero
                if(val.charAt(2)== '0') indexStart= 3;  //if third place equal to zero
                else indexStart= 2;                    //if third place not equal to zero
            }
            else indexStart= 1;             //if second place not equal to zero

            forLoop(indexStart,val); //finally call forLoop function to print binary value after sorted
        }

    } //Main Function is terminated there
}
