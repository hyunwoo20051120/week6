public class Question10 {
    public static void main(String[] args) {
        int[] numbers = {20,30,50,70,90};
        int sum = 0;
        double average;


        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average = sum / numbers.length;
        System.out.println(average);
    }
}
