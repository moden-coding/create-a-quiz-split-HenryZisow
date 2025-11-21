import java.util.*;
//The problem should include the split method. You might also add in any String methods
//or array skills. Think about Practice Quiz problem or CodingBat problems.
//Create a question AND a solution to that question

//Give instructions for your problem below:
// Create a program that:
// 1. Takes in names and ages in the format 'name,age' until a blank input is inputted
// 2. Finds the youngest age and what that person's name is
// 3. Outputs the youngest name and their age
// 4. Breaks if any ages are invalid

public class App {
    public static void main(String[] args) throws Exception {

        // Write setup code (if needed)

        Scanner scanner = new Scanner(System.in);

        // ######################################
        // Leave room to complete code below
        String youngestName = "";
        int youngestAge = 10000000;
        while (true) {
            String input = String.valueOf(scanner.nextLine());
            String pieces[] = input.split(",");
            if (input.equals("") || (Integer.valueOf(pieces[1]) < 0)) {
                break;
            } else {
                String name = pieces[0];
                int age = Integer.valueOf(pieces[1]);
                if (age < youngestAge) {
                    youngestAge = age;
                    youngestName = name;
                }
            }
        }
        System.out.println("The youngest person is " + youngestName + " and they are " + youngestAge + " years old!");
    }
}
