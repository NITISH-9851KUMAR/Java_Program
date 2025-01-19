package Java_Program.loops;

import java.util.Scanner;
public class Name17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter NITIYA: ");
        String name=sc.next();

        if(name.toUpperCase().equals("NITIYA")){
            int n = 6;
            outer_loop: for (int i = 0; i <= n; i++)
            {

               inner_loop1: for (int j = 0; j <= 5; j++) //p
                {
                    if (j == 0 || (i == 0 && j == 1) ||
                            (i == 0 && j == 2) || (i == 0 && j == 3) ||
                            (i == 1 && j == 4) || (i == 2 && j == 0) ||
                            (i == 2 && j == 4) || (i == 3 && j == 1) ||
                            (i == 3 && j == 2) || (i == 3 && j == 3))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                inner_loop2:for (int j = 0; j <= 7; j++) //R
                {
                    if (j == 0 || (i == 0 && j == 1) ||
                            (i == 0 && j == 2) || (i == 0 && j == 3)
                            || (i == 1 && j == 4) || (i == 2 && j == 0) ||
                            (i == 2 && j == 4) || (i == 3 && j == 1) ||
                            (i == 3 && j == 2) || (i == 3 && j == 3) ||
                            (i == 4 && j == 4) || (i == 5 && j == 5) || (i == 6 && j == 7))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                inner_loop3:for (int k = 0; k <= n; k++) // space
                                    if (k == 0) System.out.print(" ");

                inner_loop4:for (int k = 0; k <= 2; k++) //I
                {
                    if (k == 1 || (i == 0 && k == 0) ||
                            (i == 0 && k == 2) || (i == 6 && k == 0) ||
                            (i == 6 && k == 2))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                inner_loop5:for (int k = 0; k <= n; k++)  //space
                                if (k == 0) System.out.print(" ");

                inner_loop6:for (int j = 0; j <= n; j++) //Y
                {
                    if ( (i == 0 && j == 0) || (i == 1 && j == 1) || (i == 2 && j == 2) || (i == 0 && j == 6) ||
                        (i == 1 && j == 5) || (i == 2 && j == 4) || (i == 3 && j == 3) || (i == 4 && j == 2) ||
                        (i == 5 && j == 1) || (i == 6 && j == 0) )
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                inner_loop7:for (int k = 0; k <= n; k++) //space
                                if (k == 0) System.out.print(" ");

                inner_loop8:for (int j = 0; j <= n; j++) //A
                {
                    if ((i == 0 && j == 3) || (i == 1 && j == 2) || (i == 1 && j == 4) || (i == 2 && j == 1) ||
                            (i == 2 && j == 5) || (i == 3) || (i == 4 && j == 0) ||
                            (i == 4 && j == 0) || (i == 5 && j == 0) ||
                            (i == 6 && j == 0) || (i == 3 && j == 6) ||
                            (i == 4 && j == 6) || (i == 5 && j == 6) || (i == 6 && j == 6))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                inner_loop9:for (int k = 0; k <= n; k++) //space
                {
                    if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4 || k == 5 || k == 6)
                        System.out.print(" ");
                }

                //Rani

                inner_loop10:for (int j = 0; j <= 7; j++) //R
                {
                    if (j == 0 || (i == 0 && j == 1) ||
                            (i == 0 && j == 2) || (i == 0 && j == 3)
                            || (i == 1 && j == 4) || (i == 2 && j == 0) ||
                            (i == 2 && j == 4) || (i == 3 && j == 1) ||
                            (i == 3 && j == 2) || (i == 3 && j == 3) ||
                            (i == 4 && j == 4) || (i == 5 && j == 5) || (i == 6 && j == 7))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                inner_loop11:for (int k = 0; k <= n; k++) //space
                                if (k == 0) System.out.print(" ");

                inner_loop12:for (int j = 0; j <= n; j++) //A
                {
                    if ((i == 0 && j == 3) || (i == 1 && j == 2) || (i == 1 && j == 4) || (i == 2 && j == 1) ||
                            (i == 2 && j == 5) || (i == 3) || (i == 4 && j == 0) ||
                            (i == 4 && j == 0) || (i == 5 && j == 0) ||
                            (i == 6 && j == 0) || (i == 3 && j == 6) ||
                            (i == 4 && j == 6) || (i == 5 && j == 6) || (i == 6 && j == 6))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                inner_loop12:for (int k = 0; k <= n; k++) //space
                                 if (k == 0) System.out.print(" ");

                inner_loop13:for (int k = 0; k <= n; k++) {  //n
                    if (k == 0 || k == 6 || (i == k))
                        System.out.print("*");
                    else System.out.print(" ");
                }

                inner_loop14:for (int k = 0; k <= n; k++) //space
                                if (k == 0) System.out.print(" ");

                inner_loop15:for (int k = 0; k <= 2; k++) //I
                {
                    if (k == 1 || (i == 0 && k == 0) ||
                            (i == 0 && k == 2) || (i == 6 && k == 0) ||
                            (i == 6 && k == 2))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }

                System.out.println(); //After execute one line they will give the space

            } //outer loop terminated here
        }
        else System.out.println("Please Write Again Name");
    }
}
