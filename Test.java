package Java_Program;

interface A {
    int x= 90;
    void method(int x);
}

interface B {
    void method(int x);
}

class MyClass  implements A, B {
    int x= 100;
    public void method(int x) {
        System.out.println("Method A from interface A");
        System.out.println(A.x);
        System.out.println(this.x);
    }
    public void method(String y){

    }


    public void methodC() {
        System.out.println("Method C from interface C");
    }
}

public class Error {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
//        obj.methodA();
//        obj.methodB();
        obj.methodC();
    }
}
