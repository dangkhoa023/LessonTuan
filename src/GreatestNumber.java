import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        // Khởi tạo input
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        // Tìm số lớn nhất
        double greatest = a;
        if (b > greatest) {
            greatest = b;
        }

        if (c > greatest) {
            greatest = c;
        }
        // Xuất
        System.out.println("The greatest: " + greatest);
        sc.close();
    }
}

