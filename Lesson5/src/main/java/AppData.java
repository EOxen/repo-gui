/**
 * Java Core. Homework 5.
 *
 * @author Elena Oxenhorn
 * @version 30.11.2021
 */

import java.io.*;
import java.util.Arrays;

public class AppData implements Serializable {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    @Override
    public String toString() {
        String strHeader = Arrays.toString(header);
        String strData = Arrays.deepToString(data);
        return strHeader + strData;
    }

    public String getHeader() {
        String strHeader = Arrays.toString(header);
        return strHeader;
    }

    public String getData() {
        String strData = Arrays.deepToString(data);
        return strData;
    }

    public static class Main {
        public static void main(String[] args) {
            String[] header = {"№", "Phone1", "Phone2"};
            int[][] data = {{1, 222222, 333333}, {2, 444444, 777777}};
              AppData appData= new AppData(header, data);
              System.out.println(appData);
              String strData = appData.getData();

            try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < header.length; i++) {
                    sb.append(header[i]);
                    if (i < (header.length-1)) {
                        sb.append(';');
                    }
                }
                sb.append('\n');
                for(int a = 0; a < data.length; a++) {
                    for(int b = 0; b < data[a].length; b++) {
                        sb.append(data[a][b]);
                        if (b < (data.length)) {
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

            char csvSplitBy = ';';
     //       CSVReader reader = CSVRreader(new FileReader("test.csv"), csvSplitBy)
    /*

            try (ObjectOutputStream objectFileOutputStream = new ObjectOutputStream(new FileOutputStream("test.csv"))){
                objectFileOutputStream.writeObject(appData);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try (ObjectInputStream objectFileInputStream = new ObjectInputStream(new FileInputStream("test.csv"))){
                System.out.println(objectFileInputStream.readObject());
            } catch (IOException | ClassNotFoundException e) {


                e.printStackTrace();
            }

     */
        }
    }
}
