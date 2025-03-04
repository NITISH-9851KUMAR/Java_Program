package Java_Program.ioFile;

import java.io.File;

public class FileClass {
    public static void main(String[] args) throws Exception{
        File fileCheck;
        if(args.length>0){
            for(int i= 0; i<args.length; i++) {
                fileCheck = new File(args[i]);
                getPaths(fileCheck);
                getInfo(fileCheck);
            }
        }
        else System.out.println("Uses: Java file checks file Name(s)");
    }

    public static void getPaths(File file){
        System.out.println("Name: "+file.getName());
        System.out.println("Path: "+file.getPath());
        System.out.println("Parent: "+file.getParent());
    }

    public static void getInfo(File file){
        if(file.exists()){
            System.out.println("File exists");
            System.out.println(file.canRead() ? " and is readable" : "");
            System.out.println(file.canWrite() ? " and is writable": "");
            System.out.println("File is last modified: "+file.lastModified());
            System.out.println("File Length: "+file.length()+" bytes");
        }
    }

}
