import java.util.ArrayList;

public class Question11 {
    public static void main(String[] args) {
        int[] numbers = {1,2,2,3,4,4,5};

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (!list.contains(numbers[i])) {
                list.add(numbers[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
