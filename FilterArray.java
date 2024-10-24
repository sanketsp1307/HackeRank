

public class FilterArray {
    public static void main(String[] args) {
        int array[] = {56, 23, 7, 89, 7, 24, 39, 24};

        System.out.println("Filtered array (without duplicates): ");
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            // Check if the current element has appeared before
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If it's not a duplicate, print it
            if (!isDuplicate) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
