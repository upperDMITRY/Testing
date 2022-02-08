package parsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OpenCSVExample {
    public static void main(String[] args) {
        String fileToParse = "input.csv";
        BufferedReader fileReader = null;

        final String DELIMITER = ",";
        try {
            String line;
            fileReader = new BufferedReader(new FileReader(fileToParse));

            while ((line = fileReader.readLine()) != null) {
                String[] tokens = line.split(DELIMITER);
                for (String token : tokens) {
                    System.out.println(token);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



                                /*** Использование кода с try with resources
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileToParse))){
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] tokens = line.split(DELIMITER);
                for (String token : tokens) {
                    System.out.println(token);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
                                 ***/
    }
}
