import java.util.Scanner;

public class validSentenceChecker {

    public static void main(String[] args) {

        //Taking input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        String input = scanner.nextLine();


        if (isValid(input)) {
            System.out.println("The entered string is a valid sentence");
        } else {
            System.out.println("The entered string is not a valid sentence");
        }
    }

    public static boolean isValid(String input) {

        //Testing if the first character in the string is Uppercase
        if (!Character.isUpperCase(input.charAt(0))) {
            return false;
        }


        //Testing if there is an even amount of Quotation marks in the string
        int quoteCount = input.length() - input.replace("\"", "").length();

        for (char ch : input.toCharArray()) {
            if (ch == '"') quoteCount++;
        }

        if (quoteCount % 2 != 0) {
            return false;
        }



        //Testing if the last character in the string ends in the required character
        if (!input.endsWith(".") && !input.endsWith("?") && !input.endsWith("!")) {
            return false;

        }


        //Testing whether there is a period throughout the string
        if (input != null && input.length() > 0 && input.charAt(input.length()-1) == '.' ){
            for (int i = 0; i < input.length() -1; i++){
                if (input.charAt(i) == '.'){
                    return false;
                }
            }
        }

        //After testing each section the return will be flipped to true if all pass the requirements
        return true;
    }
}