package bai06;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        try {
            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();

            user.setName(name);

            System.out.print("Nhập tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());

            user.setAge(age);

            System.out.println("Tên: " + user.getName());
            System.out.println("Tuổi: " + user.getAge());

            FileService.saveUser();

        } catch (NumberFormatException e) {
            Logger.logError("Tuổi phải là số!");
        } catch (InvalidAgeException e) {
            Logger.logError(e.getMessage());
        } catch (IOException e) {
            Logger.logError("Lỗi ghi file: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Chương trình kết thúc.");
        }

    }
}