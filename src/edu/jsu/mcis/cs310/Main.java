package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    // WITH THIS COMPLETED METHOD:
public String reverse(String message) {
    if (message == null) {
        return null;
    }
    StringBuilder sb = new StringBuilder(message);
    return sb.reverse().toString();
}

    
}