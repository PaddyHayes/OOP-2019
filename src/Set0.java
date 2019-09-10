import java.util.Scanner;

public class Set0 {
    public static void main(String args[]) {

        String Name, ClassName;
        int price=2, snacks;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        Name = input.nextLine();

        System.out.print("Please enter your class name: ");
        ClassName = input.nextLine();

        System.out.print("Please select the number of snacks you would like: ");
        snacks = input.nextInt();

        System.out.println("Name: " + Name + "\nClass: " + ClassName + "\nNo.Of Snacks: " + snacks + "\nPrice: " + snacks*price);


    }
}