package Java_Program;

import java.util.Scanner;
public class Test extends Thread{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Declare string arr
        String[] str= new String[5];
        for(int i= 0; i<5; i++){
            str[i]= sc.next();
        }

        // Declare an array with 5*5 size
        byte[][] flipFlop= new byte[5][5];

        //taking input value into arr
        for(int i= 0; i<5; i++){
            String val= str[i];
            for(int j= 0; j<5; j++){
                flipFlop[i][j]= (byte)(Character.getNumericValue(val.charAt(j)));
            }
        }

//         change flipFlop value with 0 to 1 and vice-versa
        for(int i= 0; i<5; i++){
            for(int j= 0; j<5; j++){
                if(flipFlop[i][j]==0){
                    flipFlop[i][j]= 1;
                }
                else flipFlop[i][j]= 0;
            }
        }

        for(int i= 0; i<5; i++){ // Print the filpFlop value
            for(int j= 0; j<5; j++){
                System.out.print(flipFlop[i][j]+" ");
            }
            System.out.println();
        }

    }
}