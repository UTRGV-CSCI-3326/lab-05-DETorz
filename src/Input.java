import java.util.Scanner;
public class Input
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        float weight;
        boolean smoker;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Your age: ");
        age = scanner.nextInt();
        System.out.print("Your weight: ");
        weight = scanner.nextFloat();
        System.out.print("(true/false) Do you smoke tabacco? ");
        smoker = scanner.nextBoolean();
        System.out.println("Your answers have been recorded: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Humanly mass (in lbs): " + weight);
        System.out.println("Smoker? " + smoker);
    }
}
