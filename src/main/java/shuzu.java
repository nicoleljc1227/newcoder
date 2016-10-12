import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/17.
 */
public class shuzu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, t;
        System.out.println("数组长度");
        n1 = input.nextInt();
        System.out.println("数组宽度");
        n2 = input.nextInt();

        int[][] a = new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                a[i][j] = input.nextInt();
            }
        }

       /* for (int i = 0; i <n1 ; i++) {
            for (int j = 0; j <n2 ; j++) {
                System.out.println(a[i][j]+"\t");

            }
            System.out.println();

        }*/
        System.out.println("目标整数");
        t = input.nextInt();
        System.out.println(Find(a, t));

    }


    public static boolean Find(int[][] array, int target) {
        for (int i = array.length - 1, j = 0; i >= 0 && j <= array[0].length - 1; ) {
            if (target > array[i][j]) {

                j += 1;
            } else if (target < array[i][j]) {
                i -= 1;
            } else {
                return true;

            }
        }
        return false;

    }

}
