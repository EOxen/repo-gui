/**
 * Java Core. Homework 5.
 *
 * @author Elena Oxenhorn
 * @version 30.11.2021
 */

import java.io.*;


public class Main {
    public static void main(String[] args) {
        String[] header = {"№", "Code", "Phone"};
        int[][] data = {{1, 2000, 33333}, {2, 4000, 77777}};
        AppData appData= new AppData(header, data);
        System.out.println(appData);

        try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < header.length; i++) {
                sb.append(header[i]);
                if (i < header.length - 1) {
                    sb.append(';');
                }
            }
            sb.append('\n');
            for (int a = 0; a < data.length; a++) {
                for (int b = 0; b < data[a].length; b++ ) {
                    sb.append(data[a][b]);
                    if (b < data[a].length - 1) {
                        sb.append(';');
                    }
                }
                sb.append('\n');
            }
            writer.write(sb.toString());
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("test.csv"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}