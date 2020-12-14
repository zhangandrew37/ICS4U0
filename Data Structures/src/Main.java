import java.io.*;
import java.util.*;

/**
 * Main class for a small program that reads input and writes output on information about extracurricular activities.
 *
 * @author Andrew Zhang
 * @version 1.0
 * @since 1.8
 */

public class Main {
    /**
     * This is the main method
     *
     * @param args The command-line arguments
     * @throws IOException when there is a problem reading input or output
     */
    public static void main(String [] args) throws IOException{
        Writer fileWriter = new FileWriter("output.txt", false);
        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        Award[] awards = new Award[3];
        Club[] clubs = new Club[3];

        for(int i=0; i<3; i++){
            awards[i] = new Award(
                    stringTokenizer.nextToken(","),
                    stringTokenizer.nextToken(","),
                    stringTokenizer.nextToken(","),
                    new Reference(
                            stringTokenizer.nextToken(","),
                            stringTokenizer.nextToken(","),
                            stringTokenizer.nextToken(","),
                            stringTokenizer.nextToken(",")
                    ),
                    stringTokenizer.nextToken(","),
                    Integer.parseInt(stringTokenizer.nextToken(",")),
                    Boolean.parseBoolean(stringTokenizer.nextToken(","))
            );

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        }

        for(int i=0; i<3; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            clubs[i] = new Club(
                    stringTokenizer.nextToken(","),
                    stringTokenizer.nextToken(","),
                    stringTokenizer.nextToken(","),
                    new Reference(
                            stringTokenizer.nextToken(","),
                            stringTokenizer.nextToken(","),
                            stringTokenizer.nextToken(","),
                            stringTokenizer.nextToken(",")
                    ),
                    Integer.parseInt(stringTokenizer.nextToken(",")),
                    Integer.parseInt(stringTokenizer.nextToken(",")),
                    Integer.parseInt(stringTokenizer.nextToken(","))
                    );
        }
        fileWriter.write("===================================================================================" + "\n");

        fileWriter.write("EXTRACURRICULAR ACTIVITIES" + "\n");
        fileWriter.write("===================================================================================" + "\n");

        for(int i=0; i<3; i++){
            fileWriter.write(awards[i] + "\n");
            fileWriter.write("===================================================================================" + "\n");
        }

        for(int i=0; i<3; i++){
            fileWriter.write(clubs[i] + "\n");
            fileWriter.write("===================================================================================" + "\n");
        }
        fileWriter.write("UPDATES" + "\n");
        fileWriter.write("===================================================================================" + "\n");
        awards[0].setOutcome("Received");
        awards[0].setDateAwarded(20201012);
        fileWriter.write("Outcome of " + awards[0].getName() + " is now: " + awards[0].getOutcome() + " as of " + awards[0].getDateAwarded() + "\n");

        clubs[2].setLevel("Mentor");
        fileWriter.write("Level of " + clubs[2].getName() + " is now: " + clubs[2].getLevel());

        fileWriter.close();
    }
}
