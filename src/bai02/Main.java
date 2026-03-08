package bai02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập tổng số người dùng: ");
            int totalUsers = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập số nhóm muốn chia: ");
            int numberOfGroups = Integer.parseInt(scanner.nextLine());

            int usersPerGroup = totalUsers / numberOfGroups;
            System.out.println("Mỗi nhóm có: " + usersPerGroup + " người.");

        } catch (ArithmeticException e) {
            System.out.println("Không thể chia cho 0!");

        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số hợp lệ!");

        } finally {
            System.out.println("Chương trình vẫn tiếp tục chạy...");
            scanner.close();
        }

        System.out.println("Kết thúc chương trình.");
    }
}
