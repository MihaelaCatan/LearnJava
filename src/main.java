public class Main {
    public static void main(String[] args) {
            System.out.println("1. The reversed string is: "+ reverseString("Hello"));
            System.out.println("2. The string is converted to upper case: " + lowerToUpperCase("java"));
            System.out.println("3. The string is converted to lower case: " + upperToLowerCase("JAVA"));
            System.out.println("4. The string is a palindrome: " + checkPalindrome("radar"));
            System.out.println("5. The number of vowels in the string is: " + countVowels("Hello world"));
            System.out.println("6. The number of consonants in the string is: " + countConsonants("Hello world"));
            System.out.println("7. The length of the string is: " + lengthOfString("hello"));
            System.out.println("8. The string with no spaces: " + removeSpaces("hello world"));
            System.out.println("9. The string with space replaced with underscore: " + replaceSpacesUnderscore("hello world"));

        }
    //1. Reverse a string
    public static String reverseString(String original){
        String reversed = new StringBuilder(original).reverse().toString();
        return reversed;
            }
    //2. Convert a string to uppercase
    public static String lowerToUpperCase(String original)  {
        String upperCaseString = original.toUpperCase();
        return upperCaseString;
    }
    //3. Convert a string to lowercase
    public static String upperToLowerCase(String original)  {
        String lowerCaseString = original.toLowerCase();
        return lowerCaseString;
    }
    //4. Check if a string is a palindrome
    public static boolean checkPalindrome(String original){
        //String originalPalindrome = original;
        String reversedString = new StringBuilder(original).reverse().toString();
        if (original.equals(reversedString)){
            return true;
        }
        else return false;
    }
    //5. Count vowels in a string
    public static int countVowels(String word){
        String[] letters = word.split("");
        int countWordVowels = 0;
        for (int i=0; i < letters.length; i++){
            if ((letters[i].equals("a")) || (letters[i].equals("e")) || (letters[i].equals("i")) || (letters[i].equals("o")) || (letters[i].equals("u"))){
                countWordVowels++;
            }
        }
        return countWordVowels;
    }
    //6. Count consonants in a string
    public static int countConsonants(String word){
        String[] letters = word.split("");
        int countLetters = 0;
        for(int i=0; i < letters.length; i++){
            if ((letters[i].matches("[a-zA-Z]"))&&(!letters[i].equals("a")) && (!letters[i].equals("e")) && (!letters[i].equals("i")) && (!letters[i].equals("o")) && (!letters[i].equals("u"))){
                countLetters++;
            }
        }
        return countLetters;
    }
    //7. Find the length of a string
    public static int lengthOfString (String string){
        return string.length();
    }
    //8. Remove whitespace from a string
    public static String removeSpaces(String origialString){
        String noSpaceString = origialString.replace(" ","");
        return noSpaceString;
    }
    //9. Replace spaces with underscores
    public static String replaceSpacesUnderscore(String originalString){
        String replacedSpaces = originalString.replace(" ","_");
        return replacedSpaces;
    }
    //10. Check if two strings are anagrams

}
