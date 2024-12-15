public class InsercionDirectaCorreccion {
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 1, 4, 0, 9, 4};
        boolean colocado = false;

        for (int i = 1; i < array.length; i++) {
            int numero = array[i];
            int j = i;
            while (!colocado && numero < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
                if (j == 0 || numero >= array[j - 1] && numero < array[j + 1] ) {
                    array[j] = numero;
                    colocado = true;
                }
            }
            colocado = false;
        }
        System.out.print("array ordenado por insercion directa --> |");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|");
        }
    }
}

