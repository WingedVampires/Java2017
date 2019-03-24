package com.lsc.lab2;

import com.lsc.lab2.count.Counter;
import com.lsc.lab2.count.Statistics;
import com.lsc.lab2.format.Format;
import com.lsc.lab2.format.FormatText;
import com.lsc.lab2.reader.ReadFile;
import com.lsc.lab2.writer.WriteFile;

import java.io.*;
import java.nio.channels.FileLockInterruptionException;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("resource" + File.separator + "了不起的盖茨比(英文版).txt");
        File outFile = new File("resource" + File.separator + "output.txt");

        try {
            String text = ReadFile.ReadByFileInputStream(file);
            System.out.println(text);
            Counter counter = new Statistics(new FormatText(text).format());
            List<Map.Entry<String, Integer>> list = counter.count();

            if (outFile.exists()) {
                outFile.delete();
            }

            WriteFile.writeByFileWriter(outFile, list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("not found");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
