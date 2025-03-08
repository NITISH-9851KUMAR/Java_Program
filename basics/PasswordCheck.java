/*
*  The password must be at least 8 characters
*  The password must contain at least one uppercase letter
*  The password must contain at least one numeric digit
* */

package Java_Program.basics;

public class PasswordCheck {
    private String password;
    boolean isValidPassword(String password){
        this.password= password;
        //Calculating the password length
        int passLength= password.length();
        boolean flagLength= false; // means length is less than 8
        if(passLength >= 8){
            flagLength= true;
        }
        //flagNum for checking if any number present in password
        boolean flagNum= false; // false means number is not present

        //flagChar for checking capital alphabet present in password
        boolean flagChar= false; // means capital letter is not present

        char ch;
        for(int i= 0; i<passLength; i++){
            ch= password.charAt(i);
            if(Character.isDigit(ch)){ // checking number
                flagNum= true;
                break;
            }
        }
        for(int i= 0; i<passLength; i++){
            ch= password.charAt(i);
            if(Character.isUpperCase(ch)){ // check capital alphabet present or not
                flagChar= true;
                break;
            }
        }
        if(flagLength && flagNum && flagChar) return true;

        else return false;
    }
    public static void main(String[] args) {

        PasswordCheck pa= new PasswordCheck();
        if(pa.isValidPassword("nitiYa@9851prish")){
            System.out.println("Password is valid ");
        }else System.out.println("Password is invalid ");
    }
}
