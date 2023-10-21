import java.util.Arrays;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(arr);
        System.out.println("Shuffled Array: " + Arrays.toString(arr));
    }

    private static void shuffleArray(int[] arr) {
        int index, temp;
        Random random = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}