package bai04;

import java.io.IOException;

public class Main {

    // Method C
    public static void saveToFile() throws IOException {
        System.out.println("Đang lưu dữ liệu vào file...");

        throw new IOException("Lỗi khi ghi dữ liệu vào file!");
    }

    // Method B
    public static void processUserData() throws IOException {
        System.out.println("Đang xử lý dữ liệu người dùng...");

        saveToFile(); // gọi Method C
    }

    // Method A
    public static void main(String[] args) {

        try {
            processUserData(); // gọi Method B
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }

        System.out.println("Chương trình vẫn tiếp tục chạy.");
    }
}