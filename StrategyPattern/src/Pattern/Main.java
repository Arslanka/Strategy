package Pattern;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        String action = scanner.nextLine();
        if (action.equals("Add"))
            context.setStrategy(new ConcreteStrategyAdd());
        else if (action.equals("Subtract"))
            context.setStrategy(new ConcreteStrategySubtract());
        else if (action.equals("Multiply"))
            context.setStrategy(new ConcreteStrategyMultiply());
        else {
            System.out.println("There is no such operation\n");
            return;
        }
        int result = context.executeStrategy(a, b);
        System.out.println("After " + action + " operation u get the answer - > " + result);
    }
}

