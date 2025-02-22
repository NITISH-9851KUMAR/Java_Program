package Java_Program.strings;

public class Palindrome {
    public static void main(String[] args) {
        String str= "aba";
        int i= 0;
        int j= str.length()-1;
        boolean flag= true;

        while(i!=j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("Not Palindrome!");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
