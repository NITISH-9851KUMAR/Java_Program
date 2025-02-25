/** The string should be compressed such that consecutive duplicates of characters are
 * replaced with the character and followed by the number of consecutive duplicates */
package Java_Program.strings;
public class StringCompression {
    public static void main(String[] args) {

        String s= "aaabbbbcddde";
        StringBuilder ans= new StringBuilder("");
        char currString= s.charAt(0);
        int count= 1;
        for(int i= 1; i<s.length(); i++){
            if( currString==s.charAt(i) ){
                count++;
            }
            else{
                ans.append(currString);
                if(count>1) ans.append(count);
                currString= s.charAt(i);
                count= 1;
            }
        }
        ans.append(currString);
        // in last count value will be 1 so last character will not append in ans value we need to add in last
        System.out.println(ans);

    }
}
