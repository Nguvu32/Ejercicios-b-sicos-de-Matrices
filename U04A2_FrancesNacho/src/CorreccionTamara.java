public class CorreccionTamara {
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 1, 4, 0, 9, 4};
        boolean colocado = false;

        for (int i = 1; i < array.length; i++) {
            int numero = array[i];
            int posicionActual = i;
            int posicionAnterior = posicionActual - 1;
            while (posicionActual > 0 && numero < array[posicionAnterior]) {
                array[posicionActual] = array[posicionAnterior];
                posicionActual--;
                posicionAnterior--;
            }
            array[posicionActual] = numero;
        }
        System.out.print("array ordenado por insercion directa --> |");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "|");
        }
    }
}
