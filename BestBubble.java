import java.util.Scanner;

public class BestBubble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int ascSwaps = countSwaps(arr, true);
        int descSwaps = countSwaps(arr, false);

        System.out.println(Math.min(ascSwaps, descSwaps));
    }

    private static int countSwaps(int[] arr, boolean isAscending) {
        int swaps = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if ((isAscending && arr[j] > arr[j + 1]) || (!isAscending && arr[j] < arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        return swaps;
    }
}