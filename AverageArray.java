import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter ten double values: ");

        double[] inputArrVal = new double[10];

        for (int i = 0; i < 10; i++) {
            inputArrVal[i] = input.nextDouble();
        }
        double result = average(inputArrVal);
        
        System.out.println("Average is " + result);
    }

    // Do not use this method.
    public static double average(int[] array) {
        int sum = 0;
        for (int el: array) {
            sum =+ el;
        }
        int averageVal = sum / array.length;

        return averageVal;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double el: array) {
            sum =+ el;
        }
        double averageVal = sum / array.length;

        return averageVal;
    }
}