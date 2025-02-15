package Java_Program.interfaces;

import java.util.Random;

interface SharedConstant{
    int NO= 0;
    int YES= 1;
    int MAYBE= 2;
    int LATER= 3;
    int SOON= 5;
    int NEVER= 6;
}
class Ask implements SharedConstant{
    Random random= new Random();

    int ask(){
        int pro=  (int)(100* random.nextDouble());

        if(pro<30)
            return NO;
        else if(pro<60)
            return YES;
        else if(pro<75)
            return LATER;
        else if(pro<98)
            return SOON;
        else return NEVER;
    }
}
public class Question implements SharedConstant {
    static void answer(int result){
        switch(result){
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
        }
    }
    public static void main(String[] args) {
        Ask a= new Ask();
        answer(a.ask());
        answer(a.ask());
        answer(a.ask());
        answer(a.ask());

    }
}
