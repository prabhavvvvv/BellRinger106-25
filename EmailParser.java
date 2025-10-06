
public class EmailParser {

    public static String parseEmail(String email) {
        // Check if the email is null or does not contain '@
        if (email == null || !email.contains("@")) {
            return "Invalid email: Missing '@' symbol";
        }

        String username = email.split("@")[0];

        if (!username.contains(".")) {
            return "Invalid username: Missing '.' to separate first and last name";
        }
         // Split the username by '.' to get the first and last name parts
        String[] nameParts = username.split("\\.");
          // Check if there are exactly two parts (first name and last name)

        if (nameParts.length != 2) {
            return "Invalid username: Should contain exactly one '.' separating first and last name";
        }


        return nameParts[0] + " " + nameParts[1];
    }

    public static void main(String[] args) {

        System.out.println(parseEmail("john.doe@example.com"));
        System.out.println(parseEmail("alice.smith@domain.com"));
        System.out.println(parseEmail("bob@domain.com"));
        System.out.println(parseEmail("jane.doe@example"));
        System.out.println(parseEmail("mary.jane.doe@domain.com")); 
    }
}
