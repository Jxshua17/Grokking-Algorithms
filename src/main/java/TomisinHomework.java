import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class TomisinHomework {
    //i could create a method that takes in a string argument and returns a string of the desired result.


    public static void main(String[] args) throws IOException {
        System.out.println("Please enter your full name: ");

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        StringBuilder initials = new StringBuilder();

        String fullName = String.valueOf(reader.readLine());

        initials.append(String.valueOf(fullName.charAt(0)).toUpperCase());

        for(int i=0;i<fullName.length();i++){
            char x = fullName.charAt(i);
            if(x == ' '){
                initials.append(String.valueOf(fullName.charAt(i+1)).toUpperCase());
            }
        }

        System.out.println(initials);
    }

}
