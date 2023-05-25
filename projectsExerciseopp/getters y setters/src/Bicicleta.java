    //* Utilizando una clase denominada "Bicicleta", crear un programa que me permita
    // crear 3 instancias de esa clase.
    // * El progrma debe permitir setear o establecer el tipo de bicicleta.
    // * El progrma debe permitir setear o establecer el numero de marchas.
    // * El programa permitir obtener el tipo de bicicleta. Una vez que obtiene,
    // me debe permitir imprimir un mensaje con ese valor.
    // * El progrma debe permitir obtener el # de marchas.
    // * Una vez que obtiene, me debe permitir imprimir un mensaje con ese valor.
public class Bicicleta {
    String tipo;
    int marchas;

    public void establecerTipo(String miTipo) {
        tipo = miTipo;
    }
    public void establecerMarchas(int misMarchas) {
        marchas = misMarchas;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public int obtenerMarchas() {
        return marchas;
    }

    public void imprimirTipo() {
        System.out.println("Tipo: " + tipo);
    }
    public void imprimirMarchas() {
        System.out.println("MARCHAS: " + marchas);

    }
}
