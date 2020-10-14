public class RandomNumberClooser {
    public static void main(String[] args) {

        int[] inputNum = {1, 2, 3, 5};

        // If match the number, return null pointer exception
        System.out.println(getRandom(inputNum));
    }

    public static int getRandom(int[] numbers) {

        int result = 0;
        boolean isMatch = false;

        int random = (int)(Math.random() * 54) + 1;
        // int random = (int)(Math.random() * 6) + 1;  For test

        for (int el: numbers) {
            if (el == random) {
                isMatch = true;
                continue;
            } else {
                result = random;
            }
        }
        return isMatch ? null : result;
    }
}