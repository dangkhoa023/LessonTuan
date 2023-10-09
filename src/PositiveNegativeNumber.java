import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[] args) {
        // Khởi tạo hàm nhập
        Scanner sc = new Scanner(System.in);
        // Khởi tạo biến
        int a = sc.nextInt();
        // Check số dương số âm
        if (a > 0) {
            //xuất
            System.out.println("Number is positive.");
        } else  {
            //xuất
            System.out.println("Number is negative.");
        }
        sc.close();
    }
}
