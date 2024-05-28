package com.pixel.goldman;

import java.util.HashSet;
import java.util.Set;

public class PangramCheckerBoth {
    private static final String ALPHABETS = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        String pangramSentence = "The quick brown fox jumps over the lazy dog";
        String nonPangramSentence = "Hello world";

        // Check if the sentences are pangrams
        System.out.println("Checking sentences using PangramChecker:");
        checkPangram(pangramSentence);
        checkPangram(nonPangramSentence);

        // Check if the sentences are non-pangrams
        System.out.println("\nChecking sentences using NonPangramChecker:");
        checkNonPangram(pangramSentence);
        checkNonPangram(nonPangramSentence);
    }

    public static void checkPangram(String sentence) {
        if (isPangram(sentence.toLowerCase())) {
            System.out.println("\"" + sentence + "\" is a pangram.");
        } else {
            System.out.println("\"" + sentence + "\" is not a pangram.");
        }
    }

    public static void checkNonPangram(String sentence) {
        if (isNonPangram(sentence.toLowerCase())) {
            System.out.println("\"" + sentence + "\" is not a pangram.");
        } else {
            System.out.println("\"" + sentence + "\" is a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char c : ALPHABETS.toCharArray()) {
            alphabetSet.add(c);
        }

        for (char c : sentence.toCharArray()) {
            if (alphabetSet.contains(c)) {
                alphabetSet.remove(c);
            }
            if (alphabetSet.isEmpty()) {
                return true;
            }
        }

        return alphabetSet.isEmpty();
    }

    public static boolean isNonPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char c : ALPHABETS.toCharArray()) {
            alphabetSet.add(c);
        }

        for (char c : sentence.toCharArray()) {
            if (alphabetSet.contains(c)) {
                alphabetSet.remove(c);
            }
            if (alphabetSet.isEmpty()) {
                return false;
            }
        }

        return !alphabetSet.isEmpty();
    }
}
