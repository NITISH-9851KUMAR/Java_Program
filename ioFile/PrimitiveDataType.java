package Java_Program.ioFile;

import java.io.*;

public class PrimitiveDataType {
    public static void main(String[] args) {

        File file3= new File("N:\\File Handling\\Buffer File.txt");

        try{

//             Write primitive data to the file
            FileOutputStream fs= new FileOutputStream(file3);
            DataOutputStream os= new DataOutputStream(fs);
            os.writeInt(12345);
            os.writeChar('a');
            os.writeBoolean(true);
            os.writeByte(32);

//             Read Primitive data from the file
            FileInputStream fis= new FileInputStream(file3);
            DataInputStream dis= new DataInputStream(fis);
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readByte());

            // Close the all file connection
            dis.close();
            os.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
