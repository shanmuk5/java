// Online Java Compiler
// Use this editor to write, compile and run your Java code online

//program for interface
import java.io.*;
interface Language {
    void getName(String name);
}
class ProgrammingLanguage implements Language {
    public void getName(String name) {
        System.out.println("My favorite program language is " +name);
    }
}
class InterfaceDemo {
    public static void main(String args[]) {
        ProgrammingLanguage pl=new ProgrammingLanguage();
        pl.getName("Java");
    }
}
