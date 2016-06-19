package lesson33_reading_files_with_filereader;

import java.io.*;

public class AppCodeOnly {

    public static void main(String[] args) {

        File file = new File("test.txt");
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader(file);

            br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found : " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to open file : " + file.toString());
        }

        finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close file : " + file.toString());
            } catch (NullPointerException e) {
                System.out.println("File was never opened : " + file.toString());
            }

        }

    }
}
