
public class Main {
    public static void main(String[] args) {
        //creacion de objetos
        Futbolista ronaldo = new Futbolista("Real Madrid", 7, "Portugal");
        Futbolista messi = new Futbolista("Barcelona", 10,"Argentina");

        //GETTERS
        System.out.println("Ronaldo es de: " + ronaldo.getPais());
        System.out.println(messi.getPais());

        //SETTERS
        ronaldo.setEquipo("Al-nassr");
        System.out.println(ronaldo.getEquipo());
    }
}