import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static ArrayList<ElectionResult> parse2016ElectionResults(String data) {
    /*    Create your return arraylist
        split input data by \n to create array of rows
        loop over all rows BUT SKIP THE FIRST ROW (look at the file to see why)
        for each row {
            split it into individual values and save into the right kinds of variables.
                    Create a new object using those values
            Add it to your list.
        }
    */    return results;
    }

}
