package Java_Program.ioFile;

import java.io.IOException;
import java.io.*;
import java.util.Date;

public class FileMethod {
    public static void getPaths(File f) throws IOException{
        System.out.println("Name: "+f.getName());
        System.out.println("Path: "+f.getPath());
        System.out.println("Parent: "+f.getParent());
    }
    public static void getInfo(File f) throws IOException{
        if(f.exists()){
            System.out.println("File exists");
            System.out.println(f.canRead() ? " and is readable":"");
            System.out.println(f.canWrite() ? " and is writable": "");
            System.out.println("File is last modified: "+new Date(f.lastModified()));
            System.out.println("File is "+f.length()+"bytes");
        }
        else System.out.println("File doesn't exist.");
    }
    public static void main(String[] args) throws IOException{

        File fileToCheck;
        for(int i= 0; i< args.length; i++){
            fileToCheck= new File(args[i]);
            getPaths(fileToCheck);
            getInfo(fileToCheck);

        }

    }
}
