package bai01;

import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập năm sinh của bạn: ");

            String input = scanner.nextLine();

            // Chuyển chuỗi sang số
            int birthYear = Integer.parseInt(input);

            int currentYear = Year.now().getValue();
            int age = currentYear - birthYear;

            System.out.println("Tuổi của bạn là: " + age);

        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Bạn phải nhập số. Ví dụ: 2000");

        } finally {
            scanner.close();
            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
        }
    }
}
