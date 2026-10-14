package week01_basics;
 import java.util.Arrays;
 import java.util.Scanner;
  // seraching target and returning the first and last postiion of that  target elemenet in the sorted array
public class BinarySearcching_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of  an array");
        int size = sc.nextInt();
        System.out.println("enter the Array in Assending order");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target element ");
        int target = sc.nextInt();

        int[] res = TargetIndexRet(arr, target);
        System.out.println(Arrays.toString(res));


    }

    static int[] TargetIndexRet(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int firstI = -1;
        int lastI = -1;

        if (arr.length == 0) {
            return new int[]{-1, -1}; 
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                firstI = mid;
                end = mid - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        start = 0;
        end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                lastI = mid;
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

    /*if(firstI ==-1 && lastI==-1){
        return new int[] {-1,-1};
    }*/ //no need to retuyrn this as if the last and firts i is -1 -1 then it iwll alkreacxdy return -1 and -1

        return new int[]{firstI, lastI};

    }
}
