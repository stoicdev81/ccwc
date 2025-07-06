/* This is my implementation of a limited recreation of the linux wc command
 * line utility as a solution to the coding challenge here:
 * https://codingchallenges.fyi/challenges/challenge-wc/ 
 */



import java.io.File;
import java.util.Scanner;

public class ccwc {
    public static void main(String[] args) throws Exception {
        String switchCase;
        String file;
        if (args.length == 1) {
            switchCase = "-c";
            file = System.getProperty("user.dir") + "/" + args[0];
        } else {
            switchCase = args[0];
            file = System.getProperty("user.dir") + "/" + args[1];
        }
        File inText = new File(file);
        Scanner myScanner = new Scanner(inText);

        int i = 0;

        switch (switchCase) {
            case "-c":
                System.out.println(inText.length());
                break;
                
            case "-l":
                while (myScanner.hasNextLine()) {
                    i++;
                    myScanner.nextLine();
                }
                System.out.println(i);
                break;

            case "-w":
                while (myScanner.hasNext()) {
                    i++;
                    myScanner.next();
                }
                System.out.println(i);
                break;
        
            default:
                break;
        }


        myScanner.close();

    }
}
