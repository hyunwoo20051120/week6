import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {2,4,6,8,10};

        System.out.println("숫자 입력");
        int num = sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                System.out.println("존재합니다");
            }
            else System.out.println("존재하지 않습니다"); break;
        }
    }
}
