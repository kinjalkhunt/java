import java.util.regex.Pattern;

/*public class regex {
    // Main function
    public static void main(String[] args)
    {
        // Checks if the string matches with the regex
        // Should be single character a to z
        System.out.println(Pattern.matches("[a-z]", "a"));
 
        // Check if the element is range a to z or A to Z
        System.out.println(
            Pattern.matches("[a-zA-Z]", "Gfg"));
    }
}*/

class regex {
    // Main function
    public static void main(String[] args)
    {
        // Checks if the string matches with the regex
        // Should be single character a to z
        System.out.println(Pattern.matches("[a-z]", "i"));
 
         // Check if all the elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "Gfg"));
 
        // Check if all the elements are non-spaces
        System.out.println(Pattern.matches("\\S+", "G fg"));
    }
}

    
