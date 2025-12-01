import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("--- Suma de dos números ---");
            System.out.print("Introduce el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Introduce el segundo número: ");
            int num2 = scanner.nextInt();

            int suma = num1 + num2;
            System.out.println("El resultado de la suma es: " + suma);
        } catch (Exception e) {
            System.out.println("Error: Introduce números válidos.");
        } finally {
            scanner.close();
        }
    }
}