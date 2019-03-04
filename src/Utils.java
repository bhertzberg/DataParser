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
     //   Create your return arraylist;
        ArrayList<ElectionResult> results = new ArrayList<>();
      //  split input data by \n to create array of rows
        String[] lines = data.split("\n");

     //   loop over all rows BUT SKIP THE FIRST ROW (look at the file to see why)
        for (int a = 1; a < lines.length; a++) {

     //       for each row {
     //       split it into individual values and save into the right kinds of variables.
            String[] lineOfCoordinates = lines[a].split(",");

     //account for comma in difference which incorrectly splits number
            lineOfCoordinates[6] += lineOfCoordinates[7];
            for (int i = 7; i < lineOfCoordinates.length-1; i++) {
                lineOfCoordinates[i] = lineOfCoordinates[i+1];
            }
            double[] numberCoordinates = new double[lineOfCoordinates.length-4];
            for (int i = 1; i < lineOfCoordinates.length; i++) {
                System.out.println(lineOfCoordinates.length);
                lineOfCoordinates[i].trim();
            }
            for (int i = 1; i < numberCoordinates.length; i++) {
                // make every number value ready to parse into an integer or a double by removing % or ,
                System.out.println(lineOfCoordinates[i]);
                lineOfCoordinates[i] = cleanUp(lineOfCoordinates[i]);

                System.out.println(lineOfCoordinates[i]);
                numberCoordinates[i] = Double.parseDouble(lineOfCoordinates[i]);
            }
       //             Create a new object using those values
            ElectionResult newElecResult = new ElectionResult(numberCoordinates[0], numberCoordinates[1], numberCoordinates[2], numberCoordinates[3], numberCoordinates[4], numberCoordinates[5], numberCoordinates[6], lineOfCoordinates[7], lineOfCoordinates[8], lineOfCoordinates[9]);
            //     Add it to your list.
            results.add(newElecResult);
        }
        return results;
    }

    private static String cleanUp(String value) {
        String cleanNumber = value;

        if(value.contains("\"") ){
           cleanNumber = value.substring(1, value.length()-1);
           //cleanNumber = value;
        }

        if (value.contains("%")){
           cleanNumber = value.substring(0, value.length()-1);
        }
        return cleanNumber;
    }

}
