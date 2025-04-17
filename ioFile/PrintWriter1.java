package Java_Program.ioFile;

import java.io.PrintWriter;

public class PrintWriter1 {
    public static void main(String[] args) {

        PrintWriter pr= new PrintWriter(System.out, true);
        pr.println("Hello world");
        pr.close();

    }
}
