/** Given the coordinates(x,y) of a center of a circle and its radius,
 *  write a program which will determine whether a point lies inside the circle, on the circle or outside the circle.*/
package Java_Program.if_else;
public class CirclePoint {
    public static void main(String[] args) {
        double radius=34.34f;
        short x=3; //radius point
        short y=5; //radius point

        short x1=5;
        short y1=9;
        //O(x,y) A(x1,y1)

        double OA=Math.sqrt(  Math.pow( (x-x1),2 ) + Math.pow((y-y1),2));

       if(OA>radius){
           System.out.println("Outside of Circle");
       }
       else if(OA<radius){
            System.out.println("Inside of Circle");
       }
       else{
            System.out.println("On the Circle");
       }

    }
}
