import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {5,10,15,20,25,30};
        int index = -1;

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(num + "는 배열의 " + index + "번째 인덱스에 있습니다.");
        } else {
            System.out.println(num + "는 배열에 없습니다.");
        }
    }
}
