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
            lines[a] = cleanLine(lines[a]);
            String[] lineOfCoordinates = lines[a].split(",");
            ArrayList<String> coordinates = new ArrayList<>();
            for (int i = 1; i < lineOfCoordinates.length; i++) {
                coordinates.add(lineOfCoordinates[i]);
            }
            ArrayList<Double> numberCoordinates = new ArrayList<>();

            for (int i = 0; i < coordinates.size(); i++) {
                coordinates.get(i).trim();
            }
            for (int i = 0; i < 7; i++) {
                // make every number value ready to parse into an integer or a double by removing % or ,
                coordinates.set(i,clean(coordinates.get(i)));
                numberCoordinates.add(Double.parseDouble(coordinates.get(i)));

            }
       //             Create a new object using those values
            ElectionResult newElecResult = new ElectionResult( numberCoordinates.get(0), numberCoordinates.get(1), numberCoordinates.get(2), numberCoordinates.get(3), numberCoordinates.get(4), numberCoordinates.get(5), numberCoordinates.get(6), coordinates.get(7), coordinates.get(8), coordinates.get(9));
            //     Add it to your list.
            results.add(newElecResult);
        }
        return results;
    }

    public static ArrayList<Education> parse2016Education(String data) {
        //   Create your return arraylist;
        ArrayList<Education> results = new ArrayList<>();
        //  split input data by \n to create array of rows
        String[] lines = data.split("\n");

        //   loop over all rows BUT SKIP THE FIRST ROW (look at the file to see why)
        for (int a = 1; a < lines.length; a++) {

            //       for each row {
            //       split it into individual values and save into the right kinds of variables.
            lines[a] = cleanLine(lines[a]);
            String[] lineOfCoordinates = lines[a].split(",");
            ArrayList<String> coordinates = new ArrayList<>();
            for (int i = 1; i < lineOfCoordinates.length; i++) {
                coordinates.add(lineOfCoordinates[i]);
            }
            ArrayList<Double> numberCoordinates = new ArrayList<>();
        }
    }


    private static String cleanLine(String row){

        int firstQuote = row.indexOf("\"");
        int secondQuote = row.indexOf("\"", firstQuote + 1);

        while (firstQuote != -1 && secondQuote != -1){
            row = cleanSubstring(row, firstQuote, secondQuote);

            firstQuote = row.indexOf("\"");
            secondQuote = row.indexOf("\"", firstQuote+1);
        }
        return row;
    }

    private static String cleanSubstring(String row, int firstQuote, int secondQuote) {
        String before = row.substring(0, firstQuote);
        String after = row.substring(secondQuote+1);

        String toClean = row.substring(firstQuote+1, secondQuote);

        return before + clean(toClean) + after;
    }

    private static String clean(String toClean) {
        toClean = toClean.replaceAll(",", "").trim();
        toClean = toClean.replaceAll("%", "");
        return toClean;
    }

}
