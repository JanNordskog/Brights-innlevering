package sprint2;

public class CodingChallenge1 {
    public static void main(String[] args) {
        int[] input = new int[]{1, 4, 5, 7, 20000, -511, 100, -200, 400};
        int sum = 0;
        for (int number : input) {
            sum += number;
        }
        System.out.println("The sum of the array is: " + sum);
    }
}
