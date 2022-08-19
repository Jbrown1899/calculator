import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Command = new String("");
        
        System.out.println("List of operations: add subtract multiply divide alphabetize\nEnter an operation: ");
        Command = input.nextLine().toLowerCase();

        switch (Command) {
            
            case "add":
                int a, b;
                System.out.println("Enter two integers:");
                if (input.hasNextInt() == false) {
                    System.out.println("Invalid input entered. Terminating...");
                }
                else {
                    a = input.nextInt();
                    if (input.hasNextInt() == false) {
                        System.out.println("Invalid input entered. Terminating...");
                    }
                    else {
                        b = input.nextInt();
                        System.out.println("Answer: " + (a + b));
                    } 
                }
                break;


            case "subtract":
                int c, d;
                System.out.println("Enter two integers:");
                if (input.hasNextInt() == false) {
                    System.out.println("Invalid input entered. Terminating...");
                }
                else {
                    c = input.nextInt();
                    if (input.hasNextInt() == false) {
                        System.out.println("Invalid input entered. Terminating...");
                    }
                    else {
                        d = input.nextInt();
                        System.out.println("Answer: " + (c - d));
                    } 
                }
                break;


            case "multiply":
                double e, f;
                System.out.println("Enter two doubles:");
                if (input.hasNextDouble() == false) {
                    System.out.println("Invalid input entered. Terminating...");
                }
                else {
                    e = input.nextDouble();
                    if (input.hasNextDouble() == false) {
                        System.out.println("Invalid input entered. Terminating...");
                    }
                    else {
                        f = input.nextDouble();
                        double g = e * f;
                        System.out.printf("Answer: %.2f\n",g);
                    } 
                }
                break;


            case "divide":
                double h, i;
                System.out.println("Enter two doubles:");
                if (input.hasNextDouble() == false) {
                    System.out.println("Invalid input entered. Terminating...");
                }
                else {
                    h = input.nextDouble();
                    if (input.hasNextDouble() == false) {
                        System.out.println("Invalid input entered. Terminating...");
                    }
                    else {
                        i = input.nextDouble();
                        if (i != 0) {
                            double j = h / i;
                            System.out.printf("Answer: %.2f\n",j); 
                        }
                        else {
                            System.out.println("Invalid input entered. Terminating...");
                        }
                    } 
                }
                break;


            case "alphabetize":
                String k, l, lower1, lower2;
                System.out.println("Enter two words: ");
                if (input.hasNext() != (input.hasNextInt() || input.hasNextDouble())) {
                    k = input.next();
                    lower1 = k.toLowerCase();
                    if (input.hasNext() != (input.hasNextInt() || input.hasNextDouble())) {
                        l = input.next();
                        lower2 = l.toLowerCase();
                        int result = lower1.compareTo(lower2);
                        if (result < 0)
                            System.out.println("Answer: " + k + " comes before " + l +" alphabetically.");
                        else if (result > 0)
                            System.out.println("Answer: " + l + " comes before " + k +" alphabetically.");
                        else
                            System.out.println("Answer: Chicken or Egg.");
                    }
                    else {
                        System.out.println("Invalid input entered. Terminating...");
                    }
                }
                else {
                    System.out.println("Invalid input entered. Terminating...");
                }
                break;


            default:
                System.out.println("Invalid input entered. Terminating...");
                break;
        }
    }    
}
