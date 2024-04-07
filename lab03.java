import java.util.Scanner;

public class SumaNumerosNaturales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de n: ");
        int n = scanner.nextInt();
        
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
    }
}