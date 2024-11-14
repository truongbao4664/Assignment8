import java.util.Scanner;

public class Assignment8_7 {
    public static String removeExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();

        System.out.println("Chuỗi sau khi xóa khoảng trắng thừa: " + removeExtraSpaces(str));
        scanner.close();
    }
}


