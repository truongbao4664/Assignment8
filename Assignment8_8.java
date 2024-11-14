import java.util.Scanner;

public class Assignment8_8 {
    public static String findLongestWord(String str) {
        String[] words = str.trim().split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();

        System.out.println("Từ dài nhất trong chuỗi: " + findLongestWord(str));
        scanner.close();
    }
}



