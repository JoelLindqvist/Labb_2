package se.iths.main;
import java.util.Scanner;
import se.iths.Calculator.Calculator;
import se.iths.TextProcessor.TextProcessor;

//Main class
public class Main {
    public static void main(String[] args){
    Calculator calculator = new Calculator();
    TextProcessor textProcessor = new TextProcessor();

    //Running the calculator methods
    int a = 10;
    int b = 2;
    System.out.println(a + " + " + b + " = " + calculator.add(a, b));
    System.out.println(a + " - " + b + " = " + calculator.subract(a, b));
    System.out.println(a + " * " + b + " = " + calculator.multiplication(a, b));
    System.out.println(a + " / " + b + " = " + calculator.division(a, b));
    
    Scanner test = new Scanner(System.in);

    //Running the text processor
    System.out.print("Write something: ");
    String testingMethods = test.nextLine();
    textProcessor.stringToUppercase(testingMethods);
    textProcessor.stringToLowercase(testingMethods);
    textProcessor.stringReverse(testingMethods);
    test.close();
    }
}
