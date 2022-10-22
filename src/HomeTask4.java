import java.util.Arrays;
import java.util.Random;

public class HomeTask4 {
    public static void main(String[] args) {
        int[] arr = new int[10_000_00];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 2; i < arr.length; i++) {
            arr[i] =arr[i - 1] + arr[i - 2];
            System.out.println(arr[i]);
        }
    }


    }
