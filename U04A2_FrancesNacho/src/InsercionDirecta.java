public class InsercionDirecta {
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 1, 4, 0};

        for (int i = 1; i < array.length; i++) {
            int numero = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (numero > array[j] && numero < array[j + 1]) {
                    array[j + 1] = numero;
                    j = 0;
                } else if (numero < array[j]) {
                    if (j > 0) {
                        array[j + 1] = array[j];
                    } else {
                        array[j + 1] = array[j];
                        array[j] = numero;
                    }
                }
            }
        }
        System.out.print("array ordenado por insercion directa --> |");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|");
        }
    }
}
