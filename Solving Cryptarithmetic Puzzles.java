import java.util.*;

public class CryptarithmeticSolver {

    public static void main(String[] args) {
        String[] words = {"SEND", "MORE"};
        String result = "MONEY";
        
        Map<Character, Integer> solution = solveCryptarithmetic(words, result);
        if (solution != null) {
            System.out.println("Solution: " + solution);
        } else {
            System.out.println("No solution found.");
        }
    }

    public static Map<Character, Integer> solveCryptarithmetic(String[] words, String result) {
        Set<Character> uniqueChars = new HashSet<>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                uniqueChars.add(c);
            }
        }
        for (char c : result.toCharArray()) {
            uniqueChars.add(c);
        }

        if (uniqueChars.size() > 10) {
            throw new IllegalArgumentException("More than 10 unique characters, cannot be solved with single digits.");
        }

        List<Character> uniqueCharList = new ArrayList<>(uniqueChars);
        Map<Character, Integer> charToDigit = new HashMap<>();
        Set<Integer> usedDigits = new HashSet<>();

        if (solve(words, result, uniqueCharList, charToDigit, usedDigits, 0)) {
            return charToDigit;
        } else {
            return null;
        }
    }

    private static boolean solve(String[] words, String result, List<Character> uniqueChars,
                                 Map<Character, Integer> charToDigit, Set<Integer> usedDigits, int index) {
        if (index == uniqueChars.size()) {
            return isSolved(words, result, charToDigit);
        }

        char currentChar = uniqueChars.get(index);
        for (int digit = 0; digit <= 9; digit++) {
            if (!usedDigits.contains(digit)) {
                charToDigit.put(currentChar, digit);
                usedDigits.add(digit);

                if (solve(words, result, uniqueChars, charToDigit, usedDigits, index + 1)) {
                    return true;
                }

                usedDigits.remove(digit);
                charToDigit.remove(currentChar);
            }
        }
        return false;
    }

    private static boolean isSolved(String[] words, String result, Map<Character, Integer> charToDigit) {
        long sum = 0;
        for (String word : words) {
            sum += toNumber(word, charToDigit);
        }
        long resultNumber = toNumber(result, charToDigit);
        return sum == resultNumber;
    }

    private static long toNumber(String word, Map<Character, Integer> charToDigit) {
        long number = 0;
        for (char c : word.toCharArray()) {
            number = number * 10 + charToDigit.get(c);
        }
        return number;
    }
}
