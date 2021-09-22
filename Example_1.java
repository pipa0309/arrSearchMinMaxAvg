import java.util.Random;

public class Example_1 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = getInts(random);

        printArr(arr);
        min(arr, random);
        max(arr, random);
        avg(arr, random);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int[] getInts(Random random) {
        int[] arr = new int[101];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return arr;
    }

    //search min value
    public static void min(int[] arr, Random random) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("min = " + min);
    }

    //search max value
    public static void max(int[] arr, Random random) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);
    }

    //search avg value
    public static void avg(int[] arr, Random random) {
        double avg = arr[0];
        double avgSum = 0.0;

        for (int i = 1; i < arr.length; i++) {
            arr[i] = random.nextInt(101);
            avg += arr[i];
            avgSum = avg / arr.length;
        }
        System.out.println("avg = " + avgSum);
    }
}
