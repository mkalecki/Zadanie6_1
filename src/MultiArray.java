import java.util.Random;

public class MultiArray {

    int[][] numbers;

    MultiArray(int N, int M) {

        this.numbers = new int[N][M];

        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = rand.nextInt(100);
            }
        }
    }

    void randomize() {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(100);
            }
        }
    }

    int findMin() {
        int min = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] < min) {
                    min = numbers[i][j];
                }
            }
        }
        return min;
    }

    int findMax() {
        int max = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] > max) {
                    max = numbers[i][j];
                }
            }
        }
        return max;
    }

    void print(){
        for (int i=0; i<numbers.length; i++){
            for (int j=0; j<numbers[i].length; j++) {
                System.out.print(numbers[i][j] +" ");

            }
            System.out.println();
        }
    }
}