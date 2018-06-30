import java.util.ArrayList;
import java.util.List;

public class PigLatinConverter {

    // TODO - Need to add a test for the converter and refract code in PigLatinConvert class after.
    private static String wordToConvert = "string";
    private static List<String> vowelList = new ArrayList<>();

    public static void main(String[] args) {

        createVowelList(vowelList);
        convertWordToPigLatin(wordToConvert);

    }

    // Create a list with vowels
    private static List<String> createVowelList(List<String> list) {

        list.add("a");
        list.add("e");
        list.add("i");
        list.add("o");
        list.add("u");

        return list;

    }

    // Method for converting words to pigLatin.
    private static String convertWordToPigLatin(String convert) {

        int firstLetterCounter = 0;
        int nextLetterCounter = firstLetterCounter + 1;
        String letterCheck;
        String failedToFindVowel = "Failed to convert - could not find a vowel";

        for (int i = 0; i < convert.length(); i++) {

            letterCheck = convert.substring(firstLetterCounter, nextLetterCounter);
            String afterFirstVowel = convert.substring(firstLetterCounter, convert.length());
            String beforeFirstVowel = convert.substring(0, firstLetterCounter);

            for (String vowel : vowelList) {

                if (vowel.equals(letterCheck)) {
                    return afterFirstVowel + beforeFirstVowel + "ay";
                }

            }

            firstLetterCounter++;
            nextLetterCounter++;

        }

        return failedToFindVowel;
    }
}
