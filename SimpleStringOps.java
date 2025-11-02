import java.util.Scanner;

public class SimpleStringOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.println("\n--- String Operations ---");
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s2.toLowerCase());
        System.out.println("Concatenation: " + s1 + " " + s2);

        if (s1.equals(s2))
            System.out.println("Both strings are Equal.");
        else
            System.out.println("Strings are Not Equal.");

        sc.close();
    }
}
