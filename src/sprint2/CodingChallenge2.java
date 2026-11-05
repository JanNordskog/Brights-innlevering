package sprint2;

public class CodingChallenge2 {
    public static void main(String[] args) {
        int size = 10;
        int[][] table = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                table[row][col] = (row + 1) * (col + 1);
            }
        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.printf("%-5d", table[row][col]);
            }
            System.out.println();
        }
    }
}
