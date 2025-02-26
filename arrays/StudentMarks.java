/** Given an array of marks of students, if the mark of any student is less than 35 prints its roll number.*/

package Java_Program.arrays;

public class StudentMarks {
    public static void main(String[] args) {

            int marks[]= {40, 30, 32, 50, 51, 35};
            for(int i= 0; i<marks.length; i++){
                if(marks[i]< 35){
                    System.out.print("Roll Number: "+ (i+1) +"\n");
                }
            }
    }
}
