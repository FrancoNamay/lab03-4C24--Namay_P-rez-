import java.util.Scanner;

public class SumaDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();
        
        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        // Calcular la suma de los dos números
        double suma = numero1 + numero2;
        
        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("¡Programa finalizado!");
        System.out.println("Chao");
        System.out.println("Buenos dias");
    }
}