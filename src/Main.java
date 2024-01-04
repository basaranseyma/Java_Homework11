import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double temperature;

        Scanner inp = new Scanner(System.in);
        System.out.print("Hello! I can recommend an activity based on the weather in your area.\nPlease enter the temperature here: ");
        temperature = inp.nextDouble();

        if (temperature < 5) {
            System.out.println("I recommend you go skiing.");
        } if (temperature >= 5 && temperature <= 15) {
            System.out.println("I recommend you go to the cinema.");
        } if (temperature > 15 && temperature <= 25) {
            System.out.println("I recommend you go for a picnic.");
        } if (temperature > 25) {
            System.out.println("I recommend you go swimming.");
        }
    }
}