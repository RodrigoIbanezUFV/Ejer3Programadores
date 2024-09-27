import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Codigo inicial que será ampliado por los desarrolladores
        System.out.println("Bienvenido a la Calculadora Básica.");
        scanner.close();
        System.out.println("Ingrese el primer número para la suma:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número para la suma:");
        double num2 = scanner.nextDouble();

        double result = num1 + num2;
        System.out.println("El resultado de la suma es: " + resul
    
        // Añadir después de la implementación de la suma
        System.out.println("Ingrese el primer número para la resta:");
        double num3 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número para la resta:");
        double num4 = scanner.nextDouble();

        double resultSub = num3 - num4;
        System.out.println("El resultado de la resta es: " + resultSub);

        // Añadir después de la implementación de la resta
        System.out.println("Ingrese el primer número para la multiplicación:");
        double num5 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número para la multiplicación:");
        double num6 = scanner.nextDouble();

        double resultMul = num5 * num6;
        System.out.println("El resultado de la multiplicación es: " + resultMul);

        // Añadir después de la implementación de la multiplicación
        System.out.println("Ingrese el primer número para la división:");
        double num7 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número para la división:");
        double num8 = scanner.nextDouble();

        if (num8 != 0) {
            double resultDiv = num7 / num8;
            System.out.println("El resultado de la división es: " + resultDiv);
        } else {
            System.out.println("Error: División por cero no permitida.");
        }

    }
}
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la Calculadora Básica.");
        
        double num1 = getValidatedNumber(scanner, "Ingrese el primer número para la suma:");
        double num2 = getValidatedNumber(scanner, "Ingrese el segundo número para la suma:");

        double result = num1 + num2;
        System.out.println("El resultado de la suma es: " + result);
    
        double num3 = getValidatedNumber(scanner, "Ingrese el primer número para la resta:");
        double num4 = getValidatedNumber(scanner, "Ingrese el segundo número para la resta:");

        double resultSub = num3 - num4;
        System.out.println("El resultado de la resta es: " + resultSub);

        double num5 = getValidatedNumber(scanner, "Ingrese el primer número para la multiplicación:");
        double num6 = getValidatedNumber(scanner, "Ingrese el segundo número para la multiplicación:");

        double resultMul = num5 * num6;
        System.out.println("El resultado de la multiplicación es: " + resultMul);

        double num7 = getValidatedNumber(scanner, "Ingrese el primer número para la división:");
        double num8 = getValidatedNumber(scanner, "Ingrese el segundo número para la división:");

        if (num8 != 0) {
            double resultDiv = num7 / num8;
            System.out.println("El resultado de la división es: " + resultDiv);
        } else {
            System.out.println("Error: División por cero no permitida.");
        }

        scanner.close();
    }

    private static double getValidatedNumber(Scanner scanner, String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, ingrese un número:");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
