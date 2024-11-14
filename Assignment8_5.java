import java.util.Scanner;

public class Assignment8_5 {
    public static String[] splitWords(String str) {
        return str.trim().split("\\s+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();

        String[] words = splitWords(str);
        System.out.println("Các từ trong chuỗi:");
        for (String word : words) {
            System.out.println(word);
        }
        scanner.close();
    }
}


