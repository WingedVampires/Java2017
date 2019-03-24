package com.lsc.lab2.writer;

import java.io.*;
import java.util.List;
import java.util.Map;

public class WriteFile {

    public static void writeByPrintStream(File file, List<Map.Entry<String, Integer>> list) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream(file));

        for (Map.Entry<String, Integer> i : list) {
            ps.println(i.getKey() + " " + i.getValue());
        }
    }

    public static void writeByFileOutputStream(File file, List<Map.Entry<String, Integer>> list) throws Exception {
        OutputStream os = new FileOutputStream(file,true);

        String text = "";
        for (Map.Entry<String, Integer> i : list) {
            text += (i.getKey() + " " + i.getValue() + "\n");
        }

        os.write(text.getBytes());
        os.close();
    }

    public static void writeByFileWriter(File file, List<Map.Entry<String, Integer>> list) throws Exception {
        Writer wrt = new FileWriter(file);
        String text = "";
        for (Map.Entry<String, Integer> i : list) {
            text += (i.getKey() + " " + i.getValue() + "\n");
        }

        wrt.write(text);
        wrt.close();
    }
}
