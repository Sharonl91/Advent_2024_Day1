import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> fileData = getFileData("src/Day1Input.txt");
        System.out.println(getAnswer(fileData));

    }

    public static int getAnswer(ArrayList<String> fileData) {
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();
        for (int i = 0; i < fileData.size(); i++) {
            String line = fileData.get(i);
            left.set(i, Integer.parseInt(line.split("   "[0])));
            right.set(i, Integer.parseInt(line.split("   "[1])));
            for(int j = 1; j < fileData.size();j++){
                if (left.get(j - 1) < left.get(j)){
                    int leftMin = left.get(j - 1);
                    System.out.println(leftMin);
                }
            }

        }
        return -1;
    }

    public static ArrayList<String> getFileData(String fileName) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(fileName);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}