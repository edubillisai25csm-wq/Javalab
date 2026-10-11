
import java.util.Scanner;

public class Week6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int maxLength = 0;
        int start = 0;
        int bestStart = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = start; j < i; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    start = j + 1;
                    break;
                }
            }

            if (i - start + 1 > maxLength) {
                maxLength = i - start + 1;
                bestStart = start;
            }
        }

        String longest = s.substring(bestStart, bestStart + maxLength);

        System.out.println("Length: " + maxLength);
        System.out.println("String: " + longest);

        sc.close();
    }
}

