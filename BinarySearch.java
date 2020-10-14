import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] sortedArr = {4, 8, 12, 43, 65, 86, 100, 209, 323, 498};

        Scanner input = new Scanner(System.in);
        System.out.print("What nubers do you want to search? : ");
        int targetNumber = input.nextInt();

        System.out.println("Index number is " + binarySearch(sortedArr, targetNumber));
    }

    
    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        int index = -1;

        while (left < right) {
            int mid = (int)Math.floor((left + right) / 2);
            if (array[mid] == target) {
                index = mid;
                return index;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        // No exsisting case.
        return index;
    }
}