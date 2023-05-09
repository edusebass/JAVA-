import java.util.Scanner; // program uses class Scanner
public class Addition {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int number1; // first number to add
        int number2; // second number to add
        int sum; // sum of number1 and number2Scanner input = new Scanner(System.in);

        int res;
        int multi;
        int divi;

        System.out.println("Enter first integer: ");
        number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        number2 = input.nextInt(); // read second number from user

        sum = number1 + number2; // add numbers, then store total in sum
        res = number1 - number2;
        multi = number1 * number2;
        divi = number1 / number2;

        System.out.printf("La suma es: %d%n", sum); // display sum
        System.out.printf("La resta es: %d%n", res);
        System.out.printf("La multiplicación es: %d%n", multi);
        System.out.printf("La division es: %d%n", divi);
        
        //////////////////////////////////////////////////////////////EXERCISE CICLO FOR
        //MOSTRAR EN PANTALLA TODOS LOS NUMEROS HASTA EL LIMITE QUE PONGA EN N
        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
