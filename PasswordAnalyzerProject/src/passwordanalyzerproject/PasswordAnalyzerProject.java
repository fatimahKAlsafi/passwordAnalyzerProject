/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordanalyzerproject;

/**
 *
 * @author Shiro
 */
import java.util.Scanner;

public class PasswordAnalyzerProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter you password :");
        String password = input.nextLine();
        char[] passwordArray = password.toCharArray();
        int uppercaseLetter = 0, lowercaseLetter = 0, dight = 0, symbol = 0;
        for (char c : passwordArray) {
            if (c >= 65 && c <= 90) {
                uppercaseLetter++;
            } else if (c >= 97 && c <= 122) {
                lowercaseLetter++;

            } else if (c >= 48 && c <= 57) {
                dight++;

            } else {

                symbol++;
            }

        }
        if (uppercaseLetter == 0) {
            System.out.println("an uppercase letter is missing ");
        }
        if (lowercaseLetter == 0) {
            System.out.println("a lowercase letter is missing ");
        }
        if (dight == 0) {
            System.out.println("a dight is missing ");
        }
        if (symbol == 0) {
            System.out.println("a symbol is missing ");

        }

    }

}
