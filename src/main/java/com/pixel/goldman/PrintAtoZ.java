package com.pixel.goldman;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintAtoZ {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(extracted(sentence));
        IntStream.rangeClosed('a', 'z')
                .mapToObj(c -> (char) c)
                .forEach(c -> System.out.print(c));
    }

    private static boolean extracted(String sentence) {
        Set<Character> characterSet = IntStream.rangeClosed('a', 'z')
                .mapToObj(c -> (char) c).collect(Collectors.toSet());
        System.out.println(characterSet);
        for (int i = 0; i< sentence.length(); i++) {
            characterSet.remove(sentence.charAt(i));
                if (characterSet.isEmpty()){
                    return true;
                }
        }
        return false;
    }
}
