package test;

public class LaunchApp {

    public static void main(String[] args) {
        try{
            System.out.println("Hello World");
            System.out.println("Hello World 2");
            int S = 8;
            int B = 9;
            System.out.println(S + B);
            if (B > S) {
                System.out.println("Correct");
            } else {
                System.out.println("Not Correct");
            }
        } catch (Exception e) {
            System.out.println("Wrong code.");
        }
    }
}
