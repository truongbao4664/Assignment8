import java.util.Scanner;

public class Assignment8_6 {
    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();

        System.out.println("Số từ trong chuỗi: " + countWords(str));
        scanner.close();
    }
}

