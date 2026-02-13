package UsefulMethods;

public class Methods {
    //this method removes the last character of a string.
    // i think it should return an empty string if it is an empty string
    public static String removeLastChar(String string){
        String newWord = "";
        int length = string.length();

        for (int i=0;i<(length-1);i++){
            newWord = newWord.concat(String.valueOf(string.charAt(i)));
        }

        return newWord;
    }

    //this method count the amount of a particular letter that are in a word/string(if you like).
    public static int letterCount(String string, char letter){
        int count = 0;

        for (int i=0;i<string.length();i++){
            if (string.charAt(i) == letter){
                count++;
            }
        }

        return count;
    }
}
