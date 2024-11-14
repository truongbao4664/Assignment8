import java.util.Scanner;

public class Assignment8_1 {
    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập ký tự cần đếm: ");
        char ch = scanner.next().charAt(0);

        System.out.println("Số lần xuất hiện của ký tự '" + ch + "' là: " + countOccurrences(str, ch));
        scanner.close();
    }
}


