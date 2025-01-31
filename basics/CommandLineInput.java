package Java_Program.basics;

public class CommandLineInput {
    public static void main(String[] args) {

        /* In this program give the input through command prompt
        *  Thus, we need to run this program through command prompt
        *  During the Running of Program we can Pass argument as input, it would consider as String */
        System.out.print("Command Line Argument:  ");
        for(int i= 0; i<args.length; i++){
            System.out.print(args[i]+" ");
        }

    }
}
