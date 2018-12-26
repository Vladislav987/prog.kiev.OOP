package lesson12.Task;


import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class BabyStatistic {
    private final String inFileName;
    private final String outFileName;
    private final String delimiter;

    public BabyStatistic(String inFileName, String outFileName, String delimiter) {
        this.inFileName = inFileName;
        this.outFileName = outFileName;
        this.delimiter = delimiter;
    }
    public void BirthByYear(){
        try(BufferedReader reader = new BufferedReader(new FileReader(inFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFileName))) {

            Map<Integer, Integer> result = new TreeMap<>();
            String line;
            String headerLine = reader.readLine();


            while ((line = reader.readLine())!= null);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
