package Java_Program.oop.inheritance;

class House { // It is used for class Default which is within modifiers package
    private String hName= "Nitish Kumar"; //Declare with private modifiers, // accessible only same class
    int prn= 31004;  // Declare with default modifiers , // accessible only same package within any class
    protected char grade='A'; // Declare with protected modifiers  // accessible only subclass any package

    public String collName= "Sandip University"; // Declare with public modifiers  // accessible anywhere in same project
}
