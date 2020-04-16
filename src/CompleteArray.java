public class CompleteArray {
    public static void main(String[] args) {
        int[] numbers = {2,29, 33, 4,15, 62, 7, 81, 9, 10};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);
    }
}
