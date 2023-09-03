import java.util.Scanner;

public class Maxmim{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextLong();
        }
        long result = maxProduct(array);
	System.out.println(result);
    }
    static long maxProduct(long[] array) {
        int max_1 = -1;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if ((max_1 == -1) || (array[i] > array[max_1])) {
                max_1 = i;
            }
        }
        int max_2 = -1;
        for (int j = 0; j < n; j++) {
            if ((j != max_1) && ((max_2 == -1) || array[j] > array[max_2])) {
                max_2 = j;
            }
        }
        return (array[max_1] * array[max_2]);
    }

}
