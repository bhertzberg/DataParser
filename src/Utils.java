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
            ArrayList<String> coordinates = new ArrayList<>();
            for (int i = 1; i < lineOfCoordinates.length; i++) {
                coordinates.add(lineOfCoordinates[i]);
            }

     //account for comma in difference which incorrectly splits number
            ArrayList<Double> numberCoordinates = new ArrayList<>();
            if(lineOfCoordinates.length>12) {
                coordinates.set(5, coordinates.get(5)+ coordinates.get(6)) ;
                coordinates.remove(6);
            }
            if(lineOfCoordinates.length>11) {
                coordinates.set(5, coordinates.get(5)+ coordinates.get(6)) ;
                coordinates.remove(6);
            }
            for (int i = 0; i < coordinates.size(); i++) {
                coordinates.get(i).trim();
            }
            for (int i = 0; i < 7; i++) {
                // make every number value ready to parse into an integer or a double by removing % or ,
                coordinates.set(i,cleanUp(coordinates.get(i)));
                numberCoordinates.add(Double.parseDouble(coordinates.get(i)));

            }
       //             Create a new object using those values
            // inputs to constructor start at 1 to ignore the row number in the data
            ElectionResult newElecResult = new ElectionResult( numberCoordinates.get(0), numberCoordinates.get(1), numberCoordinates.get(2), numberCoordinates.get(3), numberCoordinates.get(4), numberCoordinates.get(5), numberCoordinates.get(6), coordinates.get(7), coordinates.get(8), coordinates.get(9));
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
