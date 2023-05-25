//* Utilizando una clase denominada "Bicicleta", crear un programa que me permita
// crear 3 instancias de esa clase.
// * El progrma debe permitir setear o establecer el tipo de bicicleta.
// * El progrma debe permitir setear o establecer el numero de marchas.
// * El programa permitir obtener el tipo de bicicleta. Una vez que obtiene,
// me debe permitir imprimir un mensaje con ese valor.
// * El progrma debe permitir obtener el # de marchas.
// * Una vez que obtiene, me debe permitir imprimir un mensaje con ese valor.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
        Bicicleta miBicicleta = new Bicicleta();
        Bicicleta tuBicicleta = new Bicicleta();
        Bicicleta nuestraBicicleta = new Bicicleta();

        System.out.println("Escriba el tipo: ");
        String elTipo = entrada.nextLine();
        miBicicleta.establecerTipo(elTipo);

        System.out.println("Escriba las marchas: ");
        int laMarcha = entrada.nextInt();
        miBicicleta.establecerMarchas( laMarcha );

        //imprimir el resultado
        miBicicleta.imprimirTipo();
        miBicicleta.imprimirMarchas();

    }
}