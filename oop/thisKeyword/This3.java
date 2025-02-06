package Java_Program.oop.thisKeyword;

public class This3 {
    public static class Room{
        int x, y;
        int width, height;
        public Room(){
            this(0, 0, 2, 3);
        }
        public Room(int x){
            this(x, 0, 0, 0);
        }
        public Room(int width, int height){
            this(0, 0, width, height);
        }
        public Room(int x, int y, int width, int height){
            this.x= x;
            this.y= y;
            this.width= width;
            this.height= height;
            display();
        }
        void display(){
            System.out.printf("x: %d  y: %d  width: %d  height: %d",x,y,width, height);
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Room room= new Room();
        Room room1= new Room(3);
        Room room2= new Room(3,5);
        Room room3= new Room(1, 3, 6, 10);
    }
}
