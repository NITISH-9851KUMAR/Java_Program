package Java_Program.ioFile;

import java.io.DataInputStream;

public class DataInputStreamClass {
    public static void main(String[] args) {

        float pa;
        float rate;
        float time;
        String tempString;

        try{
            DataInputStream in= new DataInputStream(System.in);
            System.out.print("Enter Principal Amount: ");
            System.out.flush();
            tempString= in.readLine();
            pa= Integer.parseInt(tempString);

            System.out.print("Enter Rate: ");
            System.out.flush();
            rate= Integer.parseInt(tempString);

            System.out.print("Enter Time: ");
            System.out.flush();
            tempString= in.readLine();
            time= Integer.parseInt(tempString);

            float interest= (pa*time*rate)/100;
            System.out.printf("Interest: %.2f",interest);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
