import java.util.ArrayList;
import java.util.Scanner;

  class Lista {
    public static void main(String[] args) {
        System.out.println("Bienvenido. El dia de hoy haremos una lista con sus 10 peliculas favoritas.");
        System.out.println("A continuacion ingrese el nombre de sus peliculas y posteriormente procederemos a ordenarlas alfabeticamente");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> peliculas = new ArrayList<>();

        System.out.println("Ingrese sus 10 películas favoritas:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Película #" + (i + 1) + ": ");
            peliculas.add(scanner.nextLine());
        }

        ordenarAlfabeticamente(peliculas);

        System.out.println("\nTop 10 películas:");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + peliculas.get(i));
        }
    }

    // Ordenar alfabeticamente
    public static void ordenarAlfabeticamente(ArrayList<String> lista) {
        int n = lista.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (lista.get(j).compareToIgnoreCase(lista.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = lista.get(i);
                lista.set(i, lista.get(minIndex));
                lista.set(minIndex, temp);
            }
        }
    }
}

