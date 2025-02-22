package Java_Program.strings;

public class PalindromeCount {
    static boolean isPalindrome(String val){
        int i=0;
        int j= val.length()-1;
        while(i<j){
            if(val.charAt(i)!= val.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str= "abdccd";
        int count= 0;
        for(int i= 0; i<str.length(); i++){
            for(int j= i+1; j<=str.length(); j++){
                if( isPalindrome(str.substring(i, j)) ==true){
                    System.out.print(str.substring(i, j)+" ");
                    count++;
                }
            }
        }
        System.out.println("\nTotal Palindrome String: "+count);
    }
}
