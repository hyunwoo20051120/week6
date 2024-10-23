public class Arraymain {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println("배열의 크기: " + numbers.length);

        int[] oldArray = {1, 2, 3};
        System.out.println("oldarry 길이는" + oldArray.length);

        int[] newArray = new int[5];
        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
        System.out.println(newArray[4]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]); // 0,1,2,3,4
        }
    }
}
