public class Question9 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] copy = new int[numbers.length];
        System.arraycopy(numbers, 0, copy, 0, numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(copy[i]);
        }
    }
}
