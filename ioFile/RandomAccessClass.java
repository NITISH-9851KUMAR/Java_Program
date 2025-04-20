package Java_Program.ioFile;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.File;

public class RandomAccessClass {
        public static void main(String[] args) throws IOException {

            File file= new File("N:\\File Handling\\Buffer File.txt");

            RandomAccessFile rFile = new RandomAccessFile(file, "rw");
            rFile.writeInt(100); // 4 byte
            rFile.writeChar('h'); // 2 byte
            rFile.writeBoolean(true); // 1 byte
            rFile.writeDouble(32.3d); // 8 byte
            rFile.writeFloat(23.3f); // 4 byte

            // if we want to read from starting  then use seek(0) after 0 byte they will read
            rFile.seek(0); // after 0(zero) byte they will start read
            System.out.println(rFile.readInt());
            System.out.println(rFile.readChar());
            System.out.println(rFile.readBoolean());
            System.out.println(rFile.readDouble());
            System.out.println(rFile.readFloat());

            // if we want to read Boolean then Boolean come after 6th byte
            rFile.seek(6); // It read after 6 byte
            System.out.println("\n"+rFile.readBoolean());

        }
}
