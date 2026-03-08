package bai03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        try {
            System.out.print("Nhập tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());

            user.setAge(age);

            System.out.println("Tuổi hợp lệ: " + user.getAge());

        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số!");

        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());

        } finally {
            scanner.close();
            System.out.println("Kết thúc chương trình.");
        }
    }
}