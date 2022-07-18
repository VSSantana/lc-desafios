public class Desafio4 {

    public static void main(String[] args) {

        int[] array1 = new int[] { 1, 3, 5, 7 };
        int[] array2 = new int[] { 2, 4, 6, 8, 12, 15 };
        int[] arrayConsolidado = new int[array1.length + array2.length];

        arrayConcat(array1, array2, arrayConsolidado);

        System.out.print("\nArray consolidado: [");

        for (int i = 0; i < (array1.length + array2.length); i++) {

            System.out.print(arrayConsolidado[i]);

            if (i < ((array1.length + array2.length) - 1))
                System.out.print(", ");
            else
                System.out.print("]");

        }

    }

    public static void arrayConcat(int[] array1, int[] array2, int[] arrayConsolidado) {

        for (int i = 0; i < (array1.length + array2.length); i++) {

            if (i < array1.length)
                arrayConsolidado[i] = array1[i];
            else
                arrayConsolidado[i] = array2[i - array1.length];

        }

    }

}
