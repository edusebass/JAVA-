import java.util.Scanner;

public class ejericicioPromedio {
    public static void main (String[] args) {
        // Implementar un programa en java que permita ingresar al usuario
        // 5 calificaciones y sacar su promedio.
        Scanner input = new Scanner(System.in);
        int nota1, nota2, nota3, nota4, nota5;
        float promedio;
        System.out.println("Ingresa la primera nota: ");
        nota1 = input.nextInt();
        System.out.println("Ingresa la segunda nota: ");
        nota2 = input.nextInt();
        System.out.println("Ingresa la tercera nota: ");
        nota3 = input.nextInt();
        System.out.println("Ingresa la cuarta nota: ");
        nota4 = input.nextInt();
        System.out.println("Ingresa la quinta nota: ");
        nota5 = input.nextInt();

        promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        System.out.println("El promedio es: " + promedio);
    }
}
