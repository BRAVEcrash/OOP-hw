import java.util.Random;

public class TwoDimArray {

    public void generate3X5() {
        int[][] array = new int[3][5];
        Random rand = new Random();

        // Populate the array with random values (0 or 1-6)
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                // 50% chance to be 0 or a number between 1 and 6
                if(rand.nextBoolean()) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = rand.nextInt(6) + 1; // 1 to 6
                }
            }
        }

        // Print the 3x5 array
        System.out.println("--- (문제3-1) 3X5 크기 2차원배열 생성과 출력 ---");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
