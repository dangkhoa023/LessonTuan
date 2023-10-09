package baitaptuan1;

import java.util.Arrays;

public class SortArray {
    public static void sortArray(int[] arr, String order) {
        if (order.equals("asc")) {
            Arrays.sort(arr); // Sắp xếp mảng theo thứ tự tăng dần
        } else if (order.equals("desc")) {
            Arrays.sort(arr); // Sắp xếp mảng theo thứ tự tăng dần xong rồi viết hàm đảo ngược
            // Đảo ngược mảng để có thứ tự giảm dần
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 10, 3, 8};
        String order = "desc" ;  // muốn tăng dần thì đổi thành asc
        System.out.println("Input Array: " + Arrays.toString(arr));
        sortArray(arr, order);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
