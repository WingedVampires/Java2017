package com.lsc.lab2.reader;

import java.io.*;

public class ReadFile {

    public static String ReadByFileInputStream(File file) throws Exception {
        InputStream input = new FileInputStream(file);
        int len = (int)file.length();
        byte data[] = new byte[len];

        input.read(data);
        String text = new String(data,"unicode");
        input.close();

        return text;
    }

    public static String ReadByFileReader(File file) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = null;
        String text = "";
        while( ( line = br.readLine() ) != null ) {
            text += new String(line.getBytes("utf-16le"), "utf-16le");
        }
        br.close();
        return text;
    }
}
