public class Question5 {
    public static void main(String[] args) {
        int[] numbers = {12, 3, 19, 7, 5};
        int low = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < low) {
                low = numbers[i];
            }
        }
        System.out.println("low = "+ low);
    }
}
