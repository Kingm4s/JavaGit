public class Main {
    public static void main(String[] args) {
        // Crear un array bidimensional llamado resultado con los datos de la tabla productos
        int[][] resultado = {
                {1, 100, 10},
                {2, 200, 20},
                {3, 150, 15},
                {4, 120, 12},
                {5, 250, 25},
                {6, 180, 18},
                {7, 300, 30},
                {8, 160, 16},
                {9, 220, 22},
                {10, 130, 13}
                // ... más registros ...
        };

        // Asignar 0 a la variable i;
        int i = 0;

        // Implementación del bucle externo
        while (i < resultado.length) {
            // Asignar 0 a la variable j;
            int j = 0;

            // Implementación del bucle interno
            while (j < resultado[i].length) {
                // Imprimir resultado[i][j] seguido de un espacio
                System.out.print(resultado[i][j] + " ");

                // Asignar j + 1 a la variable j;
                j++;
            }

            // Imprimir una nueva línea;
            System.out.println();

            // Asignar i + 1 a la variable i;
            i++;
        }
    }
}
