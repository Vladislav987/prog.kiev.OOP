package lesson12.Task1;

//Написать класс FileLineNumerator, который читает все строки из входного файла и выводит строки в выходной файл, нумеруя каждую строку.
//Входные параметры inFileName и outFileName передаются в конструкторе.
//// hamlet.txt
//To be, or not to be: that is the question:
//Whether 'tis nobler in the mind to suffer
//The slings and arrows of outrageous fortune,
//Or to take arms against a sea of troubles,
//And by opposing end them? To die: to sleep;
//No more; and, by a sleep to say we end
//The heart-ache and the thousand natural shocks
//That flesh is heir to, 'tis a consummation
//Devoutly to be wish'd. To die, to sleep;
//To sleep: perchance to dream: ay, there's the rub.

import java.io.*;

public class FileLineNumerator {
    private final String inFileName;
    private final String outFileName;

    public FileLineNumerator(String inFileName, String outFileName) {
        this.inFileName = inFileName;
        this.outFileName = outFileName;
    }

    public void runLineNumeration() {


        try (BufferedReader fileReader = new BufferedReader(new FileReader(inFileName));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outFileName))) {
            String str;
            int count = 1;
            while ((str = fileReader.readLine()) != null) {
                str = count + ". " + str + "\n";
                fileWriter.write(str);
                count++;
            }
            fileReader.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}


