import java.util.Scanner;

public class FindSmallestEl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");

        double[] inputArrVal = new double[10];

        for (int i = 0; i < 10; i++) {
            inputArrVal[i] = input.nextDouble();
        }
        double result = min(inputArrVal);
        
        System.out.println("Min number is " + result);

    }

    public static double min(double[] array) {
        double min = array[0];

        for (double el: array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }
}