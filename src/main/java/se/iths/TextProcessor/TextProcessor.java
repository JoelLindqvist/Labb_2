package se.iths.TextProcessor;

public class TextProcessor {
  //Method 1: return a string in uppercase
    public String stringToUppercase(String txt) {
    System.out.println(txt.toUpperCase());
    return txt.toUpperCase();
  }

  //Method 2: return a string in lowercase
  public String stringToLowercase(String txt){
    System.out.println(txt.toLowerCase());
    return txt.toLowerCase();
  }

  //Method 3: return a string reversed
  public String stringReverse(String txt) {
    StringBuilder reverse = new StringBuilder(txt);
    System.out.println(reverse.reverse().toString());
    return reverse.reverse().toString();
  }
}