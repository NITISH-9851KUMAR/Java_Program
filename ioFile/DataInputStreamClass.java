package Java_Program.ioFile;

import java.io.DataInputStream;

public class DataInputStreamClass{
		
		static float pAmount= 0.0f;
		static float rate= 0.0f;
		static float time= 0.0f;
	public static void main(String[] args){

		DataInputStream dis= new DataInputStream(System.in);
		String temp;

		try{
            System.out.print("Enter Principle Amount: ");
            System.out.flush();
            temp= dis.readLine();
            pAmount= Float.parseFloat(temp);

            System.out.print("Enter Time: ");
            System.out.flush();
            temp= dis.readLine();
            time= Float.parseFloat(temp);

            System.out.print("Enter Rate: ");
            System.out.flush();
            temp= dis.readLine();
            rate= Float.parseFloat(temp);

            float interest= (pAmount*time*rate)/100;
            System.out.printf("Interest Amout: %.2f",interest);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
		

	} //main function terminated There
}//Main Class Terminated There 