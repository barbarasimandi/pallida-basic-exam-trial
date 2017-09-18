import java.util.Arrays;

public class NameFromEmail{

  public static void main(String[] args){
    // Create a function that takes an email address as input in the following format: firstName.lastName@exam.com
    // and returns a string that represents the user name in the following format: lastName firstName
    // example: "elek.viz@exam.com" for this input the output should be: "Viz Elek"
    // accents does not matter
    System.out.println(nameFromEmail("elek.viz@exam.com"));
  }

  public static String nameFromEmail(String inputEmail) {

    char[] charInputEmail = inputEmail.toCharArray();

    int indexOfDot = inputEmail.indexOf('.');
    int indexOfAt = inputEmail.indexOf('@');

    String irstName = inputEmail.substring(1, indexOfDot);
    String astName = inputEmail.substring(indexOfDot + 2, indexOfAt);

    char firstLetterOfFirstName = inputEmail.charAt(0);
    char firstletterOfLastName = inputEmail.charAt(indexOfDot + 1);
    String upperCaseFirstNameLetter = "" + firstLetterOfFirstName.;
    String upperCaseLastNameLetter = "" + firstletterOfLastName;

    upperCaseFirstNameLetter = upperCaseFirstNameLetter.toUpperCase();
    upperCaseLastNameLetter = upperCaseLastNameLetter.toUpperCase();

    String name = upperCaseLastNameLetter + astName + " " + upperCaseFirstNameLetter + irstName;

    return name;
  }
}