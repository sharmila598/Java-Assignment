import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> originalArray = new ArrayList<>();
        originalArray.add(1);
        originalArray.add(2);
        originalArray.add(3);
        originalArray.add(4);
        originalArray.add(5);
        originalArray.add(6);
        originalArray.add(7);

        Collections.shuffle(originalArray);
        System.out.println(originalArray);
    }
}

public class Main {
    public static void main(String[] args) {
        String romanInput = "IX";
        int integerOutput = romanToInteger(romanInput);
        System.out.println(integerOutput);
    }

    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanValue(currentChar);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static int romanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        String inputText = "The quick brown fox jumps over the lazy dog";
        boolean isPangramCheck = isPangram(inputText);
        System.out.println(isPangramCheck);
    }

    public static boolean isPangram(String input) {
        input = input.toLowerCase();

        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (input.indexOf(letter) == -1) {
                return false;
            }
        }

        return true;
    }
}
