
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week13 {
    static String[] phone = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0)
            return result;

        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            String letters = phone[digits.charAt(i) - '0'];
            List<String> temp = new ArrayList<>();

            for (String s : result) {
                for (char ch : letters.toCharArray()) {
                    temp.add(s + ch);
                }
            }

            result = temp;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits: ");
        String digits = sc.nextLine();

        System.out.println(letterCombinations(digits));
        sc.close();
    }
}

