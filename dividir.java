import java.util.Scanner;

public class DivisionDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();
        
        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        // Verificar si el segundo número es cero (para evitar la división por cero)
        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            // Calcular la división de los dos números
            double division = numero1 / numero2;
            
            // Mostrar el resultado
            System.out.println("El resultado de la división de " + numero1 + " entre " + numero2 + " es: " + division);
        }
    }
}