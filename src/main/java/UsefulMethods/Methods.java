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
}
